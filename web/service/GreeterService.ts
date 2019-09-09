import { GreeterPromiseClient } from './grpc/Greeter_grpc_web_pb'
import { HelloRequest } from './grpc/Greeter_pb'

export default class GreeterService {
  constructor(private readonly hostname: string) {
    this.client = new GreeterPromiseClient(hostname, null, null)
  }

  private readonly client: GreeterPromiseClient

  public async sayHello(name: string): Promise<{message: string; nameLength: number}> {
    const request = new HelloRequest()
    request.setName(name)
    const response = await this.client.sayHello(request)
    return Promise.resolve({
      message: response.getMessage(),
      nameLength: response.getNamelength()
    })
  }
}
