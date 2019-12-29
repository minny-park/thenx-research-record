# Spring Cloud

Spring Cloud 注册中心、熔断、降级、限流等操作模块

默认情况下，如果Eureka Server在一定时间内（默认90秒）没有接收到某个微服务实例的心跳，Eureka Server将会移除该实例。 

但是,如果在15分钟内超过15%的客户端节点都没有正常的心跳，那么Eureka就认为客户端与注册中心出现了网络故障，而微服务本身是正常运行的，此时不应该移除这个微服务,这就是自我保护机制