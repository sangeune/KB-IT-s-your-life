const user = require("./user");
const hello = require("./hello-2");

console.log(user);
console.log(hello);

hello(user); // 모듈에서 가져온 user 변수와 hello 함수 사용하기
