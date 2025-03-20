let likePizza = true;

const pizza = new Promise((resolve, reject) => {
  if (likePizza) resolve('피자를 주문합니다.');
  else reject('피자를 주문하지 않습니다.');
});

pizza //
  .then((result) => console.log(result)) //
  .catch((err) => console.log(err));

function fetchData() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      let success = true; // 성공 여부를 조절해보세요.

      if (success) {
        resolve('✅ 데이터 받아오기 성공!');
      } else {
        reject('❌ 데이터 받아오기 실패!');
      }
    }, 2000); // 2초 후 실행
  });
}

// Promise 실행
fetchData()
  .then((result) => {
    console.log(result); // 성공 시 실행
  })
  .catch((error) => {
    console.error(error); // 실패 시 실행
  })
  .finally(() => {
    console.log('⏳ 데이터 요청 완료!'); // 성공/실패와 관계없이 실행
  });
