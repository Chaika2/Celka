package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class Zq_1 extends vm_3 {
   private final rgS_2 class_;
   private final ImmutableList<ZT> throws_;
   private cv_3 case_ = cv_3.class_;
   private int catch_;
   private int private_;

   protected Zq_1(rgP_2 var1, List<rgS_2> var2, ImmutableList<ZT> var3) {
      super(var1);
      this.class_ = rgS_2.class_(var2);
      this.throws_ = var3;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.protected_(0);
      class_(var1, this.super_, this.extends_, this.package_ / 2, this.catch_ - 18, -1);
      this.case_.class_(var1, this.package_ / 2, this.catch_);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void break_(QY var1, int var2, int var3) {
      super.break_(var1, var2, var3);
      UnmodifiableIterator var4 = this.throws_.iterator();

      while (var4.hasNext()) {
         ZT var5 = (ZT)var4.next();
         this.private_ = Math.max(this.private_, 20 + this.super_.class_(var5.class_) + 20);
      }

      int var11 = 5 + this.private_ + 5;
      int var12 = var11 * this.throws_.size();
      this.case_ = cv_3.class_(this.super_, this.class_, var12);
      int var6 = this.case_.class_() * 9;
      this.catch_ = (int)((double)var3 / 2.0 - (double)var6 / 2.0);
      int var7 = this.catch_ + var6 + 18;
      int var8 = (int)((double)var2 / 2.0 - (double)var12 / 2.0);

      for (UnmodifiableIterator var9 = this.throws_.iterator(); var9.hasNext(); var8 += var11) {
         ZT var10 = (ZT)var9.next();
         this.class_(new LF(var8, var7, this.private_, 20, var10.class_, var10.break_));
      }
   }

   @Override
   public String D_() {
      return super.D_() + ". " + this.class_.getString();
   }

   @Override
   public boolean E_() {
      return false;
   }
}
