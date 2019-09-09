import GreeterService from '~/service/GreeterService'
import { Context } from '@nuxt/types'

declare module 'vue/types/vue' {
  interface Vue {
    readonly $greeterService: GreeterService
  }
}

export default (ctx: Context, inject: (key: string, value: any) => void) => {
  const greeterService = new GreeterService(ctx.env['GRPC_HOST'])
  inject('greeterService', greeterService)
}
