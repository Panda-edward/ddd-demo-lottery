/**
 * @Author: Edward
 * @Date: 2020/9/2 下午11:52
 *
 * 网关层,用于与系统外界交互
 * 1.controller,对外提供接口实现,相当于OHS
 * 2.client,下游依赖服务适配接口实现,相当于ACL
 * 3.repository,与DB交互的接口实现
 */
package com.ed.panda.demo.gateways;