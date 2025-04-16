<template>
  <div style="border: solid 1px gray; padding: 5px">
    이름 : <input type="text" v-model="name" />
    <!-- 버튼을 클릭하면 'nameChanged' 이벤트를 부모에게 발신하며 {name}을 보낸다. -->
    <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
  </div>
</template>

<script>
export default {
  name: "InputName",
  emits: {
    nameChanged: (e) => {
      return e.name && typeof e.name === "string" && e.name.trim().length >= 3
        ? true
        : false; // 유효성 검증
    },
  },
  data() {
    return {
      name: "", // 입력된 이름 저장하는 변수
    };
  },
};
</script>
