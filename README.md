# alitest
背景
    存在n个资金池p，比如{p1,p2,...pn}，其中pn为当前资金池的余额，且余额不一定相同；
    现在向资金池中进行支出一定的资金额度，比如f，f可以进行自由分割
问题
    考虑一个过程、函数或者服务，使得支出的f能够从各个资金池中获取，支出完成后，资金池之间的差额达到最小。
    会考察编码设计、容错考虑、单元测试完备性等。
    最终支出后可以容忍为负债状态，即pn < 0。

回答方式
    可以考虑在github中建立工程，提供工程的地址
    也可以将工程在附件中发送回来
    在北京时间2020年4月28日，下午4时之前，回复邮件
    
示例
    AllocationSupplyResult，分配结果
    fundPoolId，资金池标示
    preAllocationShotfalls，支出前
    allocationShotfalls，支出数量
    afterAllocationShotfalls，支出后
   
 (1)随机构造20个资金池，补充资金0
    AllocationSupplyResult [fundPoolId=0, preAllocationShotfalls=20, allocationShotfalls=0, afterAllocationShotfalls=20]
    AllocationSupplyResult [fundPoolId=1, preAllocationShotfalls=47, allocationShotfalls=0, afterAllocationShotfalls=47]
    AllocationSupplyResult [fundPoolId=2, preAllocationShotfalls=21, allocationShotfalls=0, afterAllocationShotfalls=21]
    AllocationSupplyResult [fundPoolId=3, preAllocationShotfalls=41, allocationShotfalls=0, afterAllocationShotfalls=41]
    AllocationSupplyResult [fundPoolId=4, preAllocationShotfalls=29, allocationShotfalls=0, afterAllocationShotfalls=29]
    AllocationSupplyResult [fundPoolId=5, preAllocationShotfalls=9, allocationShotfalls=0, afterAllocationShotfalls=9]
    AllocationSupplyResult [fundPoolId=6, preAllocationShotfalls=76, allocationShotfalls=0, afterAllocationShotfalls=76]
    AllocationSupplyResult [fundPoolId=7, preAllocationShotfalls=97, allocationShotfalls=0, afterAllocationShotfalls=97]
    AllocationSupplyResult [fundPoolId=8, preAllocationShotfalls=29, allocationShotfalls=0, afterAllocationShotfalls=29]
    AllocationSupplyResult [fundPoolId=9, preAllocationShotfalls=66, allocationShotfalls=0, afterAllocationShotfalls=66]
    AllocationSupplyResult [fundPoolId=10, preAllocationShotfalls=60, allocationShotfalls=0, afterAllocationShotfalls=60]
    AllocationSupplyResult [fundPoolId=11, preAllocationShotfalls=92, allocationShotfalls=0, afterAllocationShotfalls=92]
    AllocationSupplyResult [fundPoolId=12, preAllocationShotfalls=94, allocationShotfalls=0, afterAllocationShotfalls=94]
    AllocationSupplyResult [fundPoolId=13, preAllocationShotfalls=27, allocationShotfalls=0, afterAllocationShotfalls=27]
    AllocationSupplyResult [fundPoolId=14, preAllocationShotfalls=43, allocationShotfalls=0, afterAllocationShotfalls=43]
    AllocationSupplyResult [fundPoolId=15, preAllocationShotfalls=75, allocationShotfalls=0, afterAllocationShotfalls=75]
    AllocationSupplyResult [fundPoolId=16, preAllocationShotfalls=41, allocationShotfalls=0, afterAllocationShotfalls=41]
    AllocationSupplyResult [fundPoolId=17, preAllocationShotfalls=74, allocationShotfalls=0, afterAllocationShotfalls=74]
    AllocationSupplyResult [fundPoolId=18, preAllocationShotfalls=64, allocationShotfalls=0, afterAllocationShotfalls=64]
    AllocationSupplyResult [fundPoolId=19, preAllocationShotfalls=61, allocationShotfalls=0, afterAllocationShotfalls=61]
    可以看到allocationShotfalls均为0。
   
(2)随机构造20个资金池，支出5000
    AllocationSupplyResult [fundPoolId=0, preAllocationShotfalls=20, allocationShotfalls=216, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=1, preAllocationShotfalls=47, allocationShotfalls=243, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=2, preAllocationShotfalls=21, allocationShotfalls=217, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=3, preAllocationShotfalls=41, allocationShotfalls=237, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=4, preAllocationShotfalls=29, allocationShotfalls=225, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=5, preAllocationShotfalls=9, allocationShotfalls=205, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=6, preAllocationShotfalls=76, allocationShotfalls=272, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=7, preAllocationShotfalls=97, allocationShotfalls=293, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=8, preAllocationShotfalls=29, allocationShotfalls=225, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=9, preAllocationShotfalls=66, allocationShotfalls=262, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=10, preAllocationShotfalls=60, allocationShotfalls=256, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=11, preAllocationShotfalls=92, allocationShotfalls=288, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=12, preAllocationShotfalls=94, allocationShotfalls=290, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=13, preAllocationShotfalls=27, allocationShotfalls=223, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=14, preAllocationShotfalls=43, allocationShotfalls=239, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=15, preAllocationShotfalls=75, allocationShotfalls=271, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=17, preAllocationShotfalls=74, allocationShotfalls=270, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=16, preAllocationShotfalls=41, allocationShotfalls=237, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=19, preAllocationShotfalls=61, allocationShotfalls=257, afterAllocationShotfalls=-196]
    AllocationSupplyResult [fundPoolId=18, preAllocationShotfalls=64, allocationShotfalls=260, afterAllocationShotfalls=-196]
    可以看到经过分配，afterAllocationShotfalls已经平均各个资金池了
    



代码输出
output
-196 7
-196 12
-196 11
-196 6
-196 15
-196 16
-196 9
-196 19
-196 18
-196 10
-196 1
-196 14
-196 3
-196 17
-196 4
-196 8
-196 13
-196 2
-196 0
-196 5
allocateFund: 5000
