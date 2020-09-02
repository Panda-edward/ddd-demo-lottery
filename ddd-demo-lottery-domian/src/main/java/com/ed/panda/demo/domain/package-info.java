/**
 * @Author: Edward
 * @Date: 2020/8/23 下午4:07
 *
 * <p>
 * 领域层,核心业务逻辑实现,按照业务领域划分。领域内包含:
 * 1.model: 领域对象定义，如聚合根、实体、值对象、领域时间
 * 2.service: 领域service,当一个业务涉及多个领域,又不能归属到某个领域中,采用service
 * 3.event: 领域事件,用于领域间调用,实现解耦
 * 3.repository: 持久化接口定义,"依赖倒置"
 * 4.factory: 负责复杂领域对象的构建
 */
package com.ed.panda.demo.domain;