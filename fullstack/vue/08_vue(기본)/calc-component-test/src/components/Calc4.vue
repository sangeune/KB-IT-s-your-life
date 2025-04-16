<!-- 버튼 제거하고, x,y 입력 시 자동 결과 계산 -->

<template>
  <div>
    X : <input type="text" v-model.number="state.x" /><br />
    Y : <input type="text" v-model.number="state.y" /><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
// 계산된 속성 computed 사용
import { reactive, computed } from "vue";

export default {
  name: "Calc4",
  setup() {
    const state = reactive({ x: 10, y: 20 });
    const result = computed(() => {
      return state.x + state.y;
    });
    return { state, result };
  },
};
</script>
