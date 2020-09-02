/**
 * @Author: Edward
 * @Date: 2020/8/23 下午5:22
 *
 * 应用层
 * 根据业务串联调用domain,发送消息,不实现业务逻辑
 * 1.executor: 根据端命令,执行具体业务操作,相当于application service
 * 2.command: 业务场景命令
 * 3.bus: 事件总线+消息总线
 * 4.client: 依赖服务的是适配接口定义,"依赖倒置"
 */
package com.ed.panda.demo.application;