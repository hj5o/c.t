/*
문제
이 서비스에서는 공간을 둘 이상 등록한 사람을 "헤비 유저"라고 부릅니다. 헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회하는 SQL문을 작성해주세요.

예시
예를 들어, PLACES 테이블이 다음과 같다면

ID	NAME	HOST_ID
4431977	BOUTIQUE STAYS - Somerset Terrace, Pet Friendly	760849
5194998	BOUTIQUE STAYS - Elwood Beaches 3, Pet Friendly	760849
16045624	Urban Jungle in the Heart of Melbourne	30900122
17810814	Stylish Bayside Retreat with a Luscious Garden	760849
22740286	FREE PARKING - The Velvet Lux in Melbourne CBD	30900122
22868779	★ Fresh Fitzroy Pad with City Views! ★	21058208
760849번 유저는 공간을 3개 등록했으므로 이 유저는 헤비유저입니다.
30900122번 유저는 공간을 2개 등록했으므로 이 유저는 헤비유저입니다.
21058208번 유저는 공간을 1개 등록했으므로 이 유저는 헤비유저가 아닙니다.
따라서 SQL 문을 실행하면 다음과 같이 나와야 합니다.

ID	NAME	HOST_ID
4431977	BOUTIQUE STAYS - Somerset Terrace, Pet Friendly	760849
5194998	BOUTIQUE STAYS - Elwood Beaches 3, Pet Friendly	760849
16045624	Urban Jungle in the Heart of Melbourne	30900122
17810814	Stylish Bayside Retreat with a Luscious Garden	760849
22740286	FREE PARKING - The Velvet Lux in Melbourne CBD	30900122
*/


SELECT id, name, host_id
from places
where host_id in (
    select host_id
    from places
    group by host_id
    having count(host_id) > 1
)
order by id