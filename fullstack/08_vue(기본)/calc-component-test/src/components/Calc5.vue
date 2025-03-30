<!-- x값이 변경될 때마다, 이전 값과 새로운 값 출력 -->

<template>
  <div>
    x : <input type="text" v-model.number="x" /><br />
    결과 : {{ result }}
  </div>
</template>

<script>
import { watch, ref } from "vue";

export default {
  name: "Calc5",
  setup() {
    const x = ref(0); // 0으로 초기화
    const result = ref(0); // 0으로 초기화

    // watch 사용하여 x값 변경될 때마다 실행
    watch(x, (current, old) => {
      console.log(`${old} -> ${current}`); // 콘솔 출력
      result.value = current * 2;
    });
    return { x, result };
  },
};
</script>
