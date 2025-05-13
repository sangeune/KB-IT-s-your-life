const fs = require("fs").promises;
async function readDirAsyn() {
  try {
    const files = await fs.readdir("./"); // Promise 객체를 리턴하는 비동기 함수
    console.log(files);
  } catch (err) {
    console.error(err);
  }
}
readDirAsyn();
