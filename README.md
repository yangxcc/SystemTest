# 系统测试
`测试问题，开发环境IDEA2019.3,整理完全部知识点后写总结` <br>
### 软件测试概论
1、软件不仅仅指的代码，软件也包括了市场需求文档、客户需求、测试文档等诸多部分，`严格定义`软件是一系列按照特定顺序组织的计算机数据和指令的集合，一般来讲软件 被划分为编程语言、系统软件、应用软件和介于这两者之间的中间件。一般认为， 软件包括如下内容：<br>
（1）运行时，能够提供所要求功能和性能的指令或计算机程序集合<br>
（2）程序能够满意地处理信息的数据结构 <br>
（3）描述程序功能需求以及程序如何操作和使用所要求的文档 <br>
⭐软件工程的三个阶段：定义、开发、检验交付与维护<br>
⭐软件开发过程中的四项基本活动：软件规格说明、软件开发、软件确认、软件演进<br>
⭐软件开发过程中的角色包括：项目经理、业务分析人员、架构师、程序员、数据设计人员等。还有测试人员的具体分类<br>
⭐**2、软件开发的过程模型包括：** 线性顺序模型(堆栈现象的风险很大)、原型模型(在原性基础上多次迭代，直到满足用户需求)、快速开发(RAD)模型(由若干个单独的RAD工作组组成，强调程序的复用性)、演化软件过程模型{包括增量模型(线性模型+原型模型)、螺旋模型(线性模型+原型模型+风险分析)}<br>
**3、软件缺陷类型**<br>
（1） 软件从未实现产品说明书要求的功能<br>
（2） 软件出现了产品说明书不应该出现的错误<br> 
（3） 软件实现了产品说明书未提到的功能 <br>
（4） 软件未实现产品说明书虽未明确提及但应该实现的功能 <br>
（5） 软件难以理解、不宜使用、运行缓慢<br>
软件缺陷是软件产品中存在的问题，最终表现为用户所要求的功能未完全实现，不能满足或不能全部满足用户的需求<br>
**产生软件缺陷的原因** <br>
- ① 软件开发过程中自身的特点：（1）软件的逻辑性 （2）需求的冻结 <br>
- ②  软件项目管理的问题<br>
- ③  团队工作的问题 <br>
对于**缺陷分析**，常用的主要缺陷参数主要有四个：状态、优先级、严重性、起源，需要注意的是，软件在从需求、设计、编码、测试一直到交付用户公开使用后的过程中，都有可能产生和发现缺陷。随着整个开发过程的时间推移，更正缺陷或修复问题的费用呈几何级数增长。<br>
**4、软件测试的定义**<br>
软件测试是发现并指出软件（包含软件经过建模、 需求、设计等阶段所产生的大量输出工件及程序代码）中存在缺陷的过程，这个 过程指明和标注问题存在的正确位置，详细记录导致问题出现的操作步骤，及时 存储当时的错误状态，以上组合在一起便于测试后问题能够准确再现。 <br>
**可以看出与测试相关的三个要点（目的）：**<br>
⭐测试是为了证明程序有错误，而不是为了证明没有错误<br>
⭐一个好的测试用例是在于他能发现至今未发现的错误（能够体现经济学观点）<br>
⭐一个成功的测试是发现了至今未发现的错误的测试<br>
**需要注意的是** 测试并不仅仅是为了找出错误，更是为了通过分析错误产生的原因和错误发生的趋势，帮助项目管理者发现当前软件开发过程中的缺陷，以便及时改进。测试还可以帮助测试人员设计出有针对性的测试方法，改善测试的效率和有效性。没有发现错误的测试也可能是有价值的，完整的测试是评定软件质量的一种方法。 <br>
**5、软件测试环境=软件测试运行的平台=硬件+软件+网络+数据**<br>
目前软件测试存在的问题包括：对测试的理解认知、测试过程的管理、测试工具的使用、测试人员的培养<br>
#### 软件测试基本知识
**6、Pareto原则(80/20原则)**<br>
☀第一个含义：80%的软件缺陷常常存在于20%的软件空间里
☀第二个含义：：在系统分析、设计、实现阶段的复审工作中能够发现和避免80%的软件缺陷，此后的系统测试能够帮助我们找出剩余缺陷中的80%，最后的20%的软件缺陷可能只有在系统交付使用后用户经过大范围、长时间使用后才会暴露出来
☀80%的软件缺陷可以通过人工测试来发现，20%的软件缺陷可以借助自动化软件来发现<br>
**7、软件标准论**
🌙验证(Verification)：检验软件是否已正确地实现了产品规格书所定义的系统功能和特性<br>
🌙有效性确认(Validation)是确认所开发的软件是否满足用户真正需求的活动。 为了深入理解软件测试，可以从以下几个方面考虑：从软件测试的目的来理解、从软件测试的性质来理解、从软件开发角度来理解、从软件工程角度来理解、从软件质量保证角度来理解<br>
**8、软件测试的原则** （1）完全测试的不可能性   （2）软件测试是有风险的活动  （3）测试无法显示潜伏的软件缺陷和故障(任何情况下都不能保证软件缺陷不存在，唯一的方法就是继续测试，找到更多的缺陷)   （4）充分注意测试中的群集现象  （5）杀虫剂现象(软件测试越多，对测试的免疫力越强，寻找更多软件缺陷就更加困难。克服的办法是：在软件测试中采用单一的方法不能高效和完全的针对所有软件缺陷，因此软件测试应该尽可能的多采用多种途径进行测试)   （6）并非所有的软件缺陷都能修复(并非意味着软件测试员没有达到目的)   （7）难以描述的软件缺陷    （8）软件测试必须有预期结果(软件缺陷是经过对比而得出来的，没有预期结果的测试是绝不可以的。我们事先不知道或是无法肯定预期的结果，我 们必然无法了解测试正确性)   （9）应当把“尽早地和不断地进行软件测试” 作为软件测试者的座右铭  （10）程序员应该避免检查自己的程序 <br>
**9、软件测试模型**<br>
**V模型**，V-model包含了三个等级，分别是生存期模型，分配模型，功能性工具需求模型，v-model指出，单元测试所检测代码的开发是否符合详细设计的要求。集成 测试所检测此前测试过的各组成部分是否能完好地结合到一起。系统测试所检测已集成在一起的产品是否符合系统规格说明书的要求。而验收测试则检测产品是否符合最终用户的需求。所以V-model模型软件测试的策略既包括低层测试又包括高层测试，底层测试是为了验证系统源代码的正确性，高层是为了测试整个系统是否满足用户的需求。 `V-model的缺陷:`仅仅把测试过程作为在需求分析、系统设计及编码之后的一个阶段,忽视了测试对需求分析,系统设计的验证，一直到后期的验收测试才被发现,无法体现“尽早地和不断地进行软件测试”的原则。  <br>
**W模型**<br>
相对于 V 模型而言，W 模型增加了软件各开发阶段中应同步进行的验证和确认（V&V）活动。 W 模型由两个 V 字型模型组成，分别代表测试与开发过程，测试伴随着整 个软件开发周期，测试的对象不仅仅是程序，需求、设计等同样要测试，也就是说，测试与开发同步进行，**W模型强调了测试计划等工作的先行和对系统需求和系统设计的测试，** 但是W模型也存在着局限性，在 W 模型中，需求、设计、编码等活动被视为串行，测试和开发活动保持着一种线性的前后关系，上一阶段结束，才开始下一个阶段工作，因此，**W 模型无法支持迭代开发模型。**<br>
**H 模型**<br>
它将测试活动完全独立出来，形成一个完全独立的流程，将测试准备活动和测试执行活动清晰地体现出来,H 模型揭示了**软件测试作为一个独立的流程贯穿于软件整个生命周期，**与其他流程并发地进行，并指出软件测试要尽早准备，尽早执行。不同的测试活动可以按照某个次序先后进行，也可能是反复的，只要某个测试达到准备就绪点，测试执行活动就可以开展<br>
**X模型**<br>
![](https://github.com/yangxcc/SystemTest/blob/master/image/Xmodel.jpg)<br>
**前置模型**<br>
该模型将测试与开发紧密结合，Pretest-model体现了以下的要点：开发和测试相结合、对每一个交付内容进行测试 、让验收测试和技术测试保持相互独立、反复交替的开发和测试、引入新的测试理念<br>
**V-model 强调了**在整个软件项目开发中需要经历的若干个测试级别，而且每一个级别都与一个开发级别相对应，但它忽略了测试的对象不应该仅仅包括程序，或者说它没有明确地之处应该对软件的需求、设计进行测试。 <br>
**W-model 强调了**测试计划等工作的先行核对系统需求和系统设计的测试，但 W-model 和 V-model 一样也没有专门对软件测试流程予以说明，因为事实上，随着软件质量要求越来越为大家所重视，软件测试也逐步发展成为一个独立于软件开发部的组织，就每一个软件测试的细节而言，它都有一个独立的操作流程。比如，现在的第三方测试，就包含了从测试计划和测试案例编写，到测试实施以及测试报告编写的全过程。 <br>
**H-model强调**测试是独立的，只要测试准备完成，就可以执行测试了。 <br>
**X-model 和 Pretest-model** 又在此基础上增加了许多不确定因素的处理情况，因为在真实项目中，经常会有变更的发生，例如需要重新访问前一阶段的内 容，或者跟踪并纠正以前提交的内容，修复错误，排除多余的成分，以及增加新发现的功能等 <br>
**10、测试用例**<br>
软件测试在软件生命周期，也就是从开发设计、运行、直到结束使用的全过程中， 主要横跨单元测试阶段和综合测试阶段两个测试阶段<br>
![](https://github.com/yangxcc/SystemTest/blob/master/image/Test_Case.png)<br>
**11、软件测试中的误区（错误观点）**<br>
- 调试和测试是一样的
- 软件测试对象就是程序
- 软件测试是测试人员的事
- 好的软件质量是通过测试得到的
- 把不合格的开发人员安排做测试
- 关注于测试的执行而忽视测试的设计
- 测试自动化是万能的
- 测试是为了证明软件的正确性

### 黑盒测试
### 白盒测试
### 单元测试
### 集成测试
### 系统测试
#### 系统测试方法
### 验收测试
### 软件测试管理




**软件测试在软件开发过程中占有重要的地位，在传统的瀑布模型中，软件测 试只成为其阶段性的一段工作——进行代码的测试。而现代软件工程思想将软件 测试认为是贯穿整个软件生命周期，并且是保证软件质量的重要手段之一。**

