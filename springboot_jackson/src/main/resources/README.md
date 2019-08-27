@JsonProperty
@JsonProperty，作用在属性上，用来为JSON Key指定一个别名。

@Jsonlgnore
@Jsonlgnore，作用在属性上，用来忽略此属性。

@JsonIgnoreProperties
@JsonIgnoreProperties，忽略一组属性，作用于类上，比如JsonIgnoreProperties({ "password", "age" })。

@JsonFormat
@JsonFormat，用于日期格式化，如：

JsonNaming
@JsonNaming，用于指定一个命名策略，作用于类或者属性上。Jackson自带了多种命名策略，你可以实现自己的命名策略，比如输出的key 由Java命名方式转为下面线命名方法 —— userName转化为user-name。

@JsonSerialize
@JsonSerialize，指定一个实现类来自定义序列化。类必须实现JsonSerializer接口，代码如下：


@JsonDeserialize
@JsonDeserialize，用户自定义反序列化，同@JsonSerialize ，类需要实现JsonDeserializer接口。

@JsonView
@JsonView，作用在类或者属性上，用来定义一个序列化组。 比如对于User对象，某些情况下只返回userName属性就行，而某些情况下需要返回全部属性。 因此User对象可以定义成如下：