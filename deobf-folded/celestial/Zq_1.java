package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class Zq_1 extends vm_3 {
   private final rgS_2 id_class;
   private final ImmutableList<ZT> id_throws;
   private cv_3 id_case = cv_3.id_class;
   private int id_catch;
   private int id_private;

   protected Zq_1(rgP_2 var1, List<rgS_2> var2, ImmutableList<ZT> var3) {
      super(var1);
      this.id_class = rgS_2.id_class(var2);
      this.id_throws = var3;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_protected(0);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, this.id_catch - 18, -1);
      this.id_case.id_class(var1, this.id_package / 2, this.id_catch);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_break(QY var1, int var2, int var3) {
      super.id_break(var1, var2, var3);
      UnmodifiableIterator var4 = this.id_throws.iterator();

      while (var4.hasNext()) {
         ZT var5 = (ZT)var4.next();
         this.id_private = Math.max(this.id_private, 20 + this.id_super.id_class(var5.id_class) + 20);
      }

      int var11 = 5 + this.id_private + 5;
      int var12 = var11 * this.id_throws.size();
      this.id_case = cv_3.id_class(this.id_super, this.id_class, var12);
      int var6 = this.id_case.id_class() * 9;
      this.id_catch = (int)((double)var3 / 2.0 - (double)var6 / 2.0);
      int var7 = this.id_catch + var6 + 18;
      int var8 = (int)((double)var2 / 2.0 - (double)var12 / 2.0);

      for (UnmodifiableIterator var9 = this.id_throws.iterator(); var9.hasNext(); var8 += var11) {
         ZT var10 = (ZT)var9.next();
         this.id_class(new LF(var8, var7, this.id_private, 20, var10.id_class, var10.id_break));
      }
   }

   @Override
   public String D_() {
      return super.D_() + ". " + this.id_class.getString();
   }

   @Override
   public boolean E_() {
      return false;
   }
}
