<template>
  <section class="section">
    <div class="container">
      <h1 class="title">gRPC(gRPC-Web) Sample</h1>
      <div class="field">
        <label class="label">Name</label>
        <div class="control">
          <input v-model="name" class="input" type="text" placeholder="Name" />
        </div>
      </div>
      <div class="control">
        <button class="button is-primary" @click="send">Send</button>
      </div>

      <div
        v-if="message && nameLength"
        class="content"
        style="margin-top: 0.75rem;"
      >
        <blockquote>{{ message }} (nameLength={{ nameLength }})</blockquote>
      </div>
    </div>
  </section>
</template>

<script lang="ts">
import { Vue, Component } from 'vue-property-decorator'

@Component({ name: 'IndexPage' })
class IndexPage extends Vue {
  name: string = ''

  message: string | null = null

  nameLength: number | null = null

  async send() {
    const { message, nameLength } = await this.$greeterService.sayHello(
      this.name
    )
    this.message = message
    this.nameLength = nameLength
  }
}

export default IndexPage
</script>
