package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rel_3 extends rrrn_1 {
   private static final Logger id_protected = LogManager.getLogger();
   protected final rev_3 id_class;
   protected rfH_2 id_break;
   private final int id_throws;
   protected final rqd_3 id_byte;
   private final List<rek_3> id_case = Lists.newArrayList();
   private final rrPt_1 id_catch;

   public rfH_2 id_byte() {
      return this.id_break;
   }

   public rel_3(rrPt_1 var1, rev_3 var2, rfH_2 var3, int var4, rqd_3 var5, rfi_3 var6) {
      super(raF_2.O, 0);
      this.id_catch = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_throws = var4;
      this.id_byte = var5;
      this.id_final = var6;
   }

   public rel_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.O, var2);
      this.id_catch = var1;
      this.id_break = new rfH_2(var2.id_private("PosX"), var2.id_private("PosY"), var2.id_private("PosZ"));
      this.id_throws = var2.id_private("ground_level_delta");
      this.id_class = rev_3.id_byte.parse(rcf_3.id_class, var2.id_int("pool_element")).resultOrPartial(id_protected::error).orElse(reJ_2.id_break);
      this.id_byte = rqd_3.valueOf(var2.id_native("rotation"));
      this.id_final = this.id_class.id_class(var1, this.id_break, this.id_byte);
      rcy_3 var3 = var2.id_protected("junctions", 10);
      this.id_case.clear();
      var3.forEach(var1x -> this.id_case.add(rek_3.id_class(new Dynamic(rcf_3.id_class, var1x))));
   }

   @Override
   public String toString() {
      return String.format("<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.id_break, this.id_byte, this.id_class);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_break("PosX", this.id_break.b_());
      var1.id_break("PosY", this.id_break.c_());
      var1.id_break("PosZ", this.id_break.d_());
      var1.id_break("ground_level_delta", this.id_throws);
      rev_3.id_byte.encodeStart(rcf_3.id_class, this.id_class).resultOrPartial(id_protected::error).ifPresent(var1x -> var1.id_class("pool_element", var1x));
      var1.id_class("rotation", this.id_byte.name());
      rcy_3 var2 = new rcy_3();

      for (rek_3 var4 : this.id_case) {
         var2.add((rcZ_2)var4.id_class(rcf_3.id_class).getValue());
      }

      var1.id_class("junctions", var2);
   }

   public void id_class(rek_3 var1) {
      this.id_case.add(var1);
   }

   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfH_2 var6, boolean var7) {
      return this.id_class.id_class(this.id_catch, var1, var2, var3, this.id_break, var6, this.id_byte, var5, var4, var7);
   }

   @Override
   public void id_class(int var1, int var2, int var3) {
      super.id_class(var1, var2, var3);
      this.id_break = this.id_break.id_break(var1, var2, var3);
   }

   @Override
   public rqd_3 id_class() {
      return this.id_byte;
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      return this.id_class(var1, var2, var3, var4, var5, var7, false);
   }

   public rev_3 id_break() {
      return this.id_class;
   }

   public List<rek_3> id_throws() {
      return this.id_case;
   }

   public int id_protected() {
      return this.id_throws;
   }
}
