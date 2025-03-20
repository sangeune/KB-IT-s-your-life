let p = new Promise((resolve, reject) => {
  resolve('first!'); // 프로미스 resolve, first! 반환
});

p.then((msg) => {
  // msg에 first! 들어감
  console.log(msg); // first! 출력
  return 'second'; // second 반환
})

  .then((msg) => {
    // msg에 second 들어감
    console.log(msg); // second 출력
    return 'third'; // third 반환
  })
  .then((msg) => {
    // msg에 third 들어감
    console.log(msg); // third 출력
  });
