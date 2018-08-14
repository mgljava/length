# length

##需求一
实现一个库: 通过这个库，用户可以以Mile为单位表一个长度，精度为1Mile。
并且，可以对比两个长度的相等性。
### 要求：
1. 代码放在github，小步提交。周二晚上我评审。
2. 使用gradle构建工具。
3. 有测试并覆盖率不得低于80%。

##### 第一步：分析对象属性和行为
Class: Quantity
- Properties:
  * amount
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

## 需求三

增加两个新的长度单位，Feet和Inch，用户可以以它们为单位表示长度，其中:

* 1 Yard == 3 Feet
* 1 Feet == 12 Inch
* 当用Feet为单位表示长度时，精度为1 Feet
* 当用Inch为单位表示长度时，精度为1 Inch
