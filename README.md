# health-master 父依赖
> 父工程，打包方式为pom，统一项目开发版本，所有子模块工程的父模块。

<br>

# tmall-common 
> 通用功能模块，存放项目中使用到的一些工具类和常量类。

<br>

# tmall-api 
> 存放po，vo，dto，service服务接口模块以及通用结果集封装对象

<br>

# tmall-core 
> 所有服务模块的公共部分，所有服务需要依赖的通用配置（配置类、依赖）。

<br>

# tmall-service-appo 
> Dubbo服务提供和消费模块，存放项目所有服务实现类，提供预约服务。

端口号：9091

<br>

# tmall-service-member 
> Dubbo服务提供模块，存放项目所有服务实现类，提供会员服务。

端口号：9092

<br>

# tmall-web 

> PC后台服务消费方，存放Controller组件，接收前端请求，调用服务。

端口号：8088

<br>

# health_h5
> 移动端服务消费方，传智健康 移动端开发 存放Controller组件 接收客户请求