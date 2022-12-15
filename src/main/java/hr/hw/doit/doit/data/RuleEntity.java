package hr.hw.doit.doit.data;

import hr.hw.doit.doit.data.doitType.DateType;
import hr.hw.doit.doit.data.doitType.DoitType;

/*
    룰 필요 없을것같은데
    왜냐면 중복을 제어하기가 너무 빡셀거같아.
 */
@Deprecated
public class RuleEntity {

    private DateType dateType;
    private DoitType doitType;
    private int count;
    private int price;
}
