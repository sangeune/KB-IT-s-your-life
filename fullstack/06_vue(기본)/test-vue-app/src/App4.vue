<template>
  <div>
    <!-- 이벤트가 발생하면 메서드 실행 -->
    <InputName @nameChanged="nameChangedHandler" />
    <br />
    <h3>App 데이터 : {{ parentName }}</h3>
  </div>
</template>

<script>
import InputName from "./components/InputName.vue";
export default {
  name: "App4",
  components: { InputName },
  data() {
    return { parentName: "" }; // 부모 컴포넌트에서 받은 name을 저장
  },
  methods: {
    nameChangedHandler(e) {
      this.parentName = e.name; // 자식에게 받은 name을 부모에 저장
    },
  },
};
</script>
