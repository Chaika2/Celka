package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class mE_2 {
   private final List<mJ_2> id_class = Lists.newArrayListWithCapacity(20);
   private mJ_2 id_break;
   private final mb_3 id_byte = new mb_3();
   private QY id_protected;
   private final List<mS_2> id_throws = Lists.newArrayList();
   private List<mG_2> id_case;
   private Lm_1 id_catch;
   private Lm_1 id_private;
   private int id_implements;
   private int id_finally;
   private rkU_2 id_extends;
   private rkw_3<?> id_native;
   private mG_2 id_volatile;

   public void id_byte() {
      this.id_byte.id_class(false);
   }

   public mE_2() {
      for (int var1 = 0; var1 < 20; var1++) {
         this.id_class.add(new mJ_2());
      }
   }

   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      if (this.id_implements > 1) {
         String var7 = this.id_finally + 1 + "/" + this.id_implements;
         int var8 = ((cm_3)this.id_protected.id_class[15]).id_break(var7);
         ((cm_3)this.id_protected.id_class[15]).id_break(var1, var7, (float)(var2 - var8 / 2 + 73), (float)(var3 + 141), -1);
      }

      this.id_break = null;

      for (mJ_2 var10 : this.id_class) {
         var10.id_class(var1, var4, var5, var6);
         if (var10.id_new && var10.B_()) {
            this.id_break = var10;
         }
      }

      this.id_private.id_class(var1, var4, var5, var6);
      this.id_catch.id_class(var1, var4, var5, var6);
      this.id_byte.id_class(var1, var4, var5, var6);
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
      if ((vm_3)this.id_protected.id_class[73] != null && this.id_break != null && !this.id_byte.id_throws()) {
         ((vm_3)this.id_protected.id_class[73]).id_class(var1, this.id_break.id_class((vm_3)this.id_protected.id_class[73]), var2, var3);
      }
   }

   public rkw_3<?> id_class() {
      return this.id_native;
   }

   public void id_class(List<rkw_3<?>> var1) {
      for (mS_2 var3 : this.id_throws) {
         var3.id_class(var1);
      }
   }

   public boolean id_class(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      this.id_native = null;
      this.id_volatile = null;
      if (this.id_byte.id_throws()) {
         if (this.id_byte.id_break(var1, var3, var5)) {
            this.id_native = this.id_byte.id_protected();
            this.id_volatile = this.id_byte.id_class();
         } else {
            this.id_byte.id_class(false);
         }

         return true;
      } else if (this.id_catch.id_break(var1, var3, var5)) {
         this.id_finally++;
         this.id_case();
         return true;
      } else if (this.id_private.id_break(var1, var3, var5)) {
         this.id_finally--;
         this.id_case();
         return true;
      } else {
         for (mJ_2 var11 : this.id_class) {
            if (var11.id_break(var1, var3, var5)) {
               if (var5 == 0) {
                  this.id_native = var11.id_throws();
                  this.id_volatile = var11.id_class();
               } else if (var5 == 1 && !this.id_byte.id_throws() && !var11.id_protected()) {
                  this.id_byte
                     .id_class(
                        this.id_protected, var11.id_class(), var11.id_volatile, var11.id_final, var6 + var8 / 2, var7 + 13 + var9 / 2, (float)var11.id_case()
                     );
               }

               return true;
            }
         }

         return false;
      }
   }

   public void id_class(ms_3 var1) {
      this.id_throws.remove(var1);
      this.id_throws.add(var1);
   }

   public void id_class(QY var1, int var2, int var3) {
      this.id_protected = var1;
      this.id_extends = ((cb_3)var1.id_class[57]).Z();

      for (int var4 = 0; var4 < this.id_class.size(); var4++) {
         this.id_class.get(var4).id_class(var2 + 11 + 25 * (var4 % 5), var3 + 31 + 25 * (var4 / 5));
      }

      this.id_catch = new Lm_1(var2 + 93, var3 + 137, 12, 17, false);
      this.id_catch.id_class(1, 208, 13, 18, ms_3.id_class);
      this.id_private = new Lm_1(var2 + 38, var3 + 137, 12, 17, true);
      this.id_private.id_class(1, 208, 13, 18, ms_3.id_class);
   }

   public void id_class(List<mG_2> var1, boolean var2) {
      this.id_case = var1;
      this.id_implements = (int)Math.ceil((double)var1.size() / 20.0);
      if (this.id_implements <= this.id_finally || var2) {
         this.id_finally = 0;
      }

      this.id_case();
   }

   public mG_2 id_break() {
      return this.id_volatile;
   }

   public rkU_2 id_throws() {
      return this.id_extends;
   }

   private void id_catch() {
      this.id_catch.id_new = this.id_implements > 1 && this.id_finally < this.id_implements - 1;
      this.id_private.id_new = this.id_implements > 1 && this.id_finally > 0;
   }

   private void id_case() {
      int var1 = 20 * this.id_finally;

      for (int var2 = 0; var2 < this.id_class.size(); var2++) {
         mJ_2 var3 = this.id_class.get(var2);
         if (var1 + var2 < this.id_case.size()) {
            mG_2 var4 = this.id_case.get(var1 + var2);
            var3.id_class(var4, this);
            var3.id_new = true;
         } else {
            var3.id_new = false;
         }
      }

      this.id_catch();
   }

   public QY id_protected() {
      return this.id_protected;
   }
}
