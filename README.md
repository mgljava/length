# length

##需求一
实现一个库: 通过这个库，用户可以以Mile为单位表一个长度，精度为1Mile。
并且，可以对比两个长度的相等性。
### 要求：
1. 代码放在github，小步提交。周二晚上我评审。
2. 使用gradle构建工具。
3. 有测试并覆盖率不得低于80%。

##### 第一步：分析对象属性和行为
Class: Length
- Properties:
  * length
  * unit
Behaive:
  * equals
##### 第二步：TDD设计测试

1. 5mile等于5mile（should_5_mile_equals_to_5_mile）
  * 测试从then开始往前写，如果明确了类的行为，那么行为的期望是已知的。 
  * 再写when，明确类的行为是如何被调用的。
  * 再写given，行为需要的入参。
  
## 需求二

用户除了可以使用Mile为单位表示长度外，还可以使Yard为单位表示长度，其中:
* 以Mile为单位表示长度时，精度为1Mile。 
* 以Yard为单位表示长度时，精度为1Yard。 
* 能够对比任意两个长度的相等性。
* 1 Mile == 1760 Yard 
* 3 Yard = 3 Yard
* 1 Mile != 1761 Yard 
* 3 Yard != 4 Yard
##### 第一步
抽象出一个单位对象，包含所有的长度的单位信息，并对单位进行初始化。如以某个单位为基本单位（以最小的单位）
，然后进行其他单位的初始化，如将英寸作为最小单位，那么1英里=63360英寸。

## 需求三

增加两个新的长度单位，Feet和Inch，用户可以以它们为单位表示长度，其中:

* 1 Yard == 3 Feet
* 1 Feet == 12 Inch
* 当用Feet为单位表示长度时，精度为1 Feet
* 当用Inch为单位表示长度时，精度为1 Inch

// ----------------------------------------------------------------------  
Hi there,

为了快速掌握Esprit上使用的技术，为你们制定了一个月的学习计划，今天下午我们一起kick off一下：
第一周

读书笔记《代码整洁之道》第1~2章。
学习并了解OO-Bootcamp材料。
练习TDD第一题：Length（不强调必须TDD），讲解。
课后作业：fizz-buzz-whizz。
第二周

读书笔记《代码整洁之道》第9~10章。
练习TDD第二题：guess-number，讲解（加入一些最佳实践，guava，reactor，apache tools等）。
课后作业：taxi。
第三周

读书笔记《重构》第1~3章。
练习TDD模式下开发GraphQL CRUD，讲解（加入CI，spring等）。
课后作业：GraphQL题。
第四周

读书笔记《重构》第4~6章。
贴近真实项目架构GraphQL+Reactor+MapStruct+TDD。