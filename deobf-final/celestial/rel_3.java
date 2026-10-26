package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rel_3 extends rrrn_1 {
   private static final Logger protected_ = LogManager.getLogger();
   protected final rev_3 class_;
   protected rfH_2 break_;
   private final int throws_;
   protected final rqd_3 byte_;
   private final List<rek_3> case_ = Lists.newArrayList();
   private final rrPt_1 catch_;

   public rfH_2 byte_() {
      return this.break_;
   }

   public rel_3(rrPt_1 var1, rev_3 var2, rfH_2 var3, int var4, rqd_3 var5, rfi_3 var6) {
      super(raF_2.O, 0);
      this.catch_ = var1;
      this.class_ = var2;
      this.break_ = var3;
      this.throws_ = var4;
      this.byte_ = var5;
      this.final_ = var6;
   }

   public rel_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.O, var2);
      this.catch_ = var1;
      this.break_ = new rfH_2(var2.private_("PosX"), var2.private_("PosY"), var2.private_("PosZ"));
      this.throws_ = var2.private_("ground_level_delta");
      this.class_ = rev_3.byte_.parse(rcf_3.class_, var2.int_("pool_element")).resultOrPartial(protected_::error).orElse(reJ_2.break_);
      this.byte_ = rqd_3.valueOf(var2.native_("rotation"));
      this.final_ = this.class_.class_(var1, this.break_, this.byte_);
      rcy_3 var3 = var2.protected_("junctions", 10);
      this.case_.clear();
      var3.forEach(var1x -> this.case_.add(rek_3.class_(new Dynamic(rcf_3.class_, var1x))));
   }

   @Override
   public String toString() {
      return String.format("<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.break_, this.byte_, this.class_);
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.break_("PosX", this.break_.b_());
      var1.break_("PosY", this.break_.c_());
      var1.break_("PosZ", this.break_.d_());
      var1.break_("ground_level_delta", this.throws_);
      rev_3.byte_.encodeStart(rcf_3.class_, this.class_).resultOrPartial(protected_::error).ifPresent(var1x -> var1.class_("pool_element", var1x));
      var1.class_("rotation", this.byte_.name());
      rcy_3 var2 = new rcy_3();

      for (rek_3 var4 : this.case_) {
         var2.add((rcZ_2)var4.class_(rcf_3.class_).getValue());
      }

      var1.class_("junctions", var2);
   }

   public void class_(rek_3 var1) {
      this.case_.add(var1);
   }

   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfH_2 var6, boolean var7) {
      return this.class_.class_(this.catch_, var1, var2, var3, this.break_, var6, this.byte_, var5, var4, var7);
   }

   @Override
   public void class_(int var1, int var2, int var3) {
      super.class_(var1, var2, var3);
      this.break_ = this.break_.break_(var1, var2, var3);
   }

   @Override
   public rqd_3 class_() {
      return this.byte_;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      return this.class_(var1, var2, var3, var4, var5, var7, false);
   }

   public rev_3 break_() {
      return this.class_;
   }

   public List<rek_3> throws_() {
      return this.case_;
   }

   public int protected_() {
      return this.throws_;
   }
}
