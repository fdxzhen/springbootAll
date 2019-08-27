启动项目，访问http://localhost:8080/swagger-ui.html即可看到Swagger给我们生成的API页面：


Swagger常用注解
@Api：修饰整个类，描述Controller的作用；
@ApiOperation：描述一个类的一个方法，或者说一个接口；
@ApiParam：单个参数描述；
@ApiModel：用对象来接收参数；
@ApiProperty：用对象接收参数时，描述对象的一个字段；
@ApiResponse：HTTP响应其中1个描述；
@ApiResponses：HTTP响应整体描述；
@ApiIgnore：使用该注解忽略这个API；
@ApiError ：发生错误返回的信息；
@ApiImplicitParam：一个请求参数；
@ApiImplicitParams：多个请求参数。

编写RESTful API接口
Spring Boot中包含了一些注解，对应于HTTP协议中的方法：
@GetMapping对应HTTP中的GET方法；
@PostMapping对应HTTP中的POST方法；
@PutMapping对应HTTP中的PUT方法；
@DeleteMapping对应HTTP中的DELETE方法；
@PatchMapping对应HTTP中的PATCH方法。
我们使用这些注解来编写一个RESTful测试Controller：