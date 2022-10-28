# TACS-Projeto

ASCT-2022/2023

Nome: Pedro Vale - 201806083

Nome: João Brandão - 201705573

Nome: Tiago Araújo - 202109481

## Concepts of the Language

| **Concept** | **Intrinsic Properties** |                      **Extrinsic Properties**                     |
|:-----------:|:------------------------:|:-----------------------------------------------------------------:|
|      CV     |      version: Float      |                    Arbitrary number of Sections                   |
|   Section   |       name: String       | Arbitrary number of Sections <br>  Arbitrary number of Attributes |
| Information |       title: String      |                       At most one SuperTypes                      |
|    Table    |       title: String      |            At most one HeadTables <br>At most one BodyTable       |
|  HeadTable  |                          |                              One Row                              |
|  BodyTable  |                          |                      Arbitrary number of Rows                     |
|     Row     |                          |                   Arbitrary number of SuperTypes                  |
|  SuperType  |                          |                   Arbitrary number of SuperTypes                  |
|   DataType  |        value: Date       |                                                                   |
|  FloatType  |       value: Float       |                                                                   |
| StringType  | value: String            |                                                                   |

## Inspiration
Our model was made to be as much abstract as possible. This way users can make the sections with all the information they want, without beeing restricted to already created ones. We based our model mainly in the CVs in **CiênciaVitae** (https://www.cienciavitae.pt/).
