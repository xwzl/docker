#!/bin/bash

#===================================================================
#    名称   |     能否引用变量  |  能否引用转移符  |  能否引用文本格式符(如：换行符、制表符)
#   单引号  |        否        |       否        |         否
#   双引号  |        能        |       能        |         能
#   无引号  |        能        |       能        |         否
#===================================================================
# 显示结果定向至文件
# echo "It is a test" > ./myfile.txt

# 追加时间至指定内容 时间用 ``
echo `date` >> ./myfile.txt