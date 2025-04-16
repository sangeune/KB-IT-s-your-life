<template>
  <div class="row mb-3">
    <div class="col">
      <!-- 입력창과 버튼 -->
      <div class="input-group">
        <input
          id="msg"
          type="text"
          class="form-control"
          name="msg"
          placeholder="할일을 여기에 입력!"
          v-model.trim="todo"
          @keyup.enter="addTodoHandler"
        />
        <span class="btn btn-primary input-group-addon" @click="addTodoHandler"
          >추가</span
        >
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "InputTodo",
  data() {
    return { todo: "" };
  },
  emits: ["add-todo"],
  methods: {
    addTodoHandler() {
      // 3글자 이상일 경우만 처리
      if (this.todo.length >= 3) {
        // 부모 컴포넌트에 'add-todo' 이벤트 전달
        this.$emit("add-todo", this.todo);
        // 입력창 초기화
        this.todo = "";
      }
    },
  },
};
</script>
