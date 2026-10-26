package celestial;

import com.google.common.collect.ImmutableMap;

public class rPq_1 extends rPm_1<iB_2> {
   private final float class_;
   private final int byte_;

   public rPq_1(float var1, int var2) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT, il_3.final_, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.byte_ = var2;
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      rfD_2 var6 = var5.byte_(il_3.final_).get();
      var5.class_(il_3.volatile_, new iH_2(var6, this.class_, this.byte_));
   }
}
