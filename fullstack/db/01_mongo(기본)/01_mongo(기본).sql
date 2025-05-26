-- Q1. 데이터베이스를 tutorial로 선정하세요.
use tutorial

-- Q2. users 컬렉션에 username이 smith인 문서를 저장하세요.
db.users.insert ({username: "smith"})

-- Q3. users 컬렉션에 username이 jones인 문서를 저장하세요.
db.users.insert ({username: "jones"})

-- Q4. 앞에서 저장한 모든 문서를 출력하세요.
db.users.find()

-- Q5. 앞에서 저장한 문서 중 하나만 출력하세요.
db.users.findOne()

-- Q6. users 컬렉션에서 username이 "jones"인 문서를 찾아서 출력하세요.
db.users.find({username: "jones"})

-- Q7. users 컬렉션에서 username이 "jones" 또는 "smith"인 문서를 찾아서 출력하세요.
db.users.find({ $or: [
	{ username: "smith" },
	{ username: "jones" }
]})

-- Q8. users 컬렉션에서 username이 smith인 문서에 country 키가 Canada 가 되도록 수정하세요.
db.users.update ({username: "smith"},{$set: {country: "Canada"}})

-- Q9. 앞의 문서가 올바르게 수정되었는지 확인하세요.
db.users.find ({username: " smith"})

-- Q10. users 컬렉션에서 username이 smith인 문서를 {country: "Canada"}로 대체하고 확인하세요.
db.users.update ({username: "smith"}, {country: "Canada"})

db.users.find({country: "Canada"})

-- Q11. users 컬렉션에서 country가 Canada인 문서를 {username: "smith", country: "Canada"}로 대체하고 확인하세요.
db.users.update ({country: "Canada"}, {$set: {username : "smith", country: "Canada"}})

db.users.find({username: "smith"})

-- Q12. users 컬렉션에서 username이 smith인 문서에서 country 키를 삭제하고, 삭제 여부를 확인하세요.
db.users.update({username: "smith"}, {$unset: {country: 1}})

db.users.find({username: "smith"})

-- Q13. 데이터베이스 전체 목록을 출력하세요.
show dbs

-- Q14. 현재 사용 중인 데이터베이스의 컬렉션 목록을 출력하세요.
show collections

-- Q15. 현재 사용 중인 데이터베이스와 users 컬렉션의 상태를 출력하세요.
db.stats()

db.users.stats()

-- Q16. users 컬렉션에서 username이 smith인 문서를 삭제하고, 삭제여부를 확인하세요.
db.users.remove({username: "smith"})

db.users.find({username: "smith"})

-- Q17. users 컬렉션의 모든 문서를 삭제하고, 삭제 여부를 확인하세요.
db.users.remove({})

db.users.find()

-- Q18. users 컬렉션을 삭제하세요.
db.users.drop()

-- Q19. 다음 형태의 문서 20,000건을 추가하세요.
use test

for(let i=0; i<20000; i++) {
  db.product.insert({ num: i, name: '스마트폰' + i });
}

-- Q20. product 컬렉션의 전체 문서수를 출력하세요.
db.product.count();

-- Q21. product 컬렉션의 문서를 num의 내림 차순으로 정렬하여 출력하세요.
db.product.find().sort({num:-1});

-- Q22. product 컬렉션의 문서를 num의 내림 차순으로 정렬하여 상위 10건을 출력하세요.
db.product.find().sort({num:-1}).limit(10);

-- Q23. product 컬렉션의 문서를 num의 내림 차순으로 정렬한 상태에서 다음을 처리하세요.
db.product.find().sort({num:-1}).skip(10*(6-1)).limit(10);

-- Q24. product 컬렉션에서 num이 15미만 이거나 19995 초과인 것을 출력하세요.
db.product.find({ $or: [{num: {$lt: 15}},{num: {$gt: 19995}},]});

-- Q25. product 컬렉션에서 name이 '스마트폰 10', '스마트폰 100', '스마트폰 1000' 중에 하나이면 출력하세요.
db.product.find({ name: {$in: ['스마트폰10', ' 스마트폰100', ' 스마트폰1000']}});

-- Q26. product 컬렉션에서 num이 5보다 작은 문서를 출력하는데, name만 출력하세요. (_id 출력하면 안됨)
db.product.find({num: {$lt: 5}}, {_id:0, name:1})