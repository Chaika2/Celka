package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rrJB extends rrJM {
   private final vm_3 id_private;
   private rgP_2 id_implements;
   private rgP_2 id_finally;
   private final List<rpl_3> id_else = Lists.newArrayList();
   protected String id_class;
   private int id_synchronized;

   public rrJB(vm_3 var1, String var2, String var3) {
      super(new rgn_3("of.options.detailsTitle"));
      this.id_private = var1;
      this.id_implements = new rgN_2(var2);
      this.id_finally = new rgN_2(var3);
      this.id_class = jI_2.id_class("gui.done");
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_case, this.id_implements, this.id_package / 2, 70, 16777215);
      byte var5 = 90;

      for (rpl_3 var7 : this.id_else) {
         id_class(var1, this.id_case, var7, this.id_package / 2, var5, 16777215);
         var5 += 9;
      }

      super.id_class(var1, var2, var3, var4);
   }

   public void id_break(int var1) {
      this.id_synchronized = var1;

      for (LZ var3 : this.id_throws) {
         var3.id_int = false;
      }
   }

   @Override
   protected void id_break(LZ var1) {
      rrbb_3.X().id_break(this.id_private);
   }

   @Override
   public void id_private() {
      super.id_private();
      if (--this.id_synchronized == 0) {
         for (LZ var2 : this.id_throws) {
            var2.id_int = true;
         }
      }
   }

   @Override
   public void v_() {
      this.id_class(new rrXi_1(0, this.id_package / 2 - 100, this.id_int / 6 + 96, this.id_class));
      this.id_else.clear();
      this.id_else.addAll(((cm_3)this.id_volatile.id_class[15]).id_break(this.id_finally, this.id_package - 50));
   }
}
