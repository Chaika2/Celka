package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class roE_2 {
   private final List<roS_2> id_class = Lists.newArrayList();
   private double id_byte = 0.2;
   private double id_protected = 5.0;
   private int id_throws = 15;
   private int id_case = 5;
   private double id_catch;
   private double id_private;
   int id_implements = 29999984;
   private roG_2 id_finally = new roO_2(this, 6.0E7);
   public static final roM_2 id_break = new roM_2(0.0, 0.0, 0.2, 5.0, 5, 15, 6.0E7, 0L, 0.0);

   public rjC_2 id_byte() {
      return this.id_finally.id_volatile();
   }

   public void id_byte(int var1) {
      this.id_case = var1;

      for (roS_2 var3 : this.id_native()) {
         var3.id_break(this, var1);
      }
   }

   public void id_byte(double var1) {
      this.id_byte = var1;

      for (roS_2 var4 : this.id_native()) {
         var4.id_break(this, var1);
      }
   }

   public double id_int() {
      return this.id_finally.id_case();
   }

   public roM_2 id_this() {
      return new roM_2(this);
   }

   public void id_class(roS_2 var1) {
      this.id_class.add(var1);
   }

   public boolean id_class(rfl_3 var1) {
      return var1.id_protected > this.id_throws() && var1.id_class < this.id_catch() && var1.id_case > this.id_case() && var1.id_byte < this.id_private();
   }

   public void id_class(int var1) {
      this.id_implements = var1;
      this.id_finally.id_finally();
   }

   public void id_class(double var1, double var3, long var5) {
      this.id_finally = (roG_2)(var1 == var3 ? new roO_2(this, var3) : new rob_3(this, var1, var3, var5));

      for (roS_2 var8 : this.id_native()) {
         var8.id_class(this, var1, var3, var5);
      }
   }

   public double id_class(an_3 var1) {
      return this.id_class(var1.rx(), var1.BO());
   }

   public void id_class(double var1) {
      this.id_finally = new roO_2(this, var1);

      for (roS_2 var4 : this.id_native()) {
         var4.id_class(this, var1);
      }
   }

   public void id_class(roM_2 var1) {
      this.id_break(var1.id_class(), var1.id_break());
      this.id_byte(var1.id_byte());
      this.id_break(var1.id_protected());
      this.id_byte(var1.id_throws());
      this.id_break(var1.id_case());
      if (var1.id_private() > 0L) {
         this.id_class(var1.id_catch(), var1.id_implements(), var1.id_private());
      } else {
         this.id_class(var1.id_catch());
      }
   }

   public boolean id_class(rfH_2 var1) {
      return (double)(var1.b_() + 1) > this.id_throws()
         && (double)var1.b_() < this.id_catch()
         && (double)(var1.d_() + 1) > this.id_case()
         && (double)var1.d_() < this.id_private();
   }

   public boolean id_class(rfj_3 var1) {
      return (double)var1.id_protected() > this.id_throws()
         && (double)var1.id_break() < this.id_catch()
         && (double)var1.id_throws() > this.id_case()
         && (double)var1.id_byte() < this.id_private();
   }

   public double id_class(double var1, double var3) {
      double var5 = var3 - this.id_case();
      double var7 = this.id_private() - var3;
      double var9 = var1 - this.id_throws();
      double var11 = this.id_catch() - var1;
      double var13 = Math.min(var9, var11);
      var13 = Math.min(var13, var5);
      return Math.min(var13, var7);
   }

   public double id_class() {
      return this.id_catch;
   }

   public void id_break(double var1) {
      this.id_protected = var1;

      for (roS_2 var4 : this.id_native()) {
         var4.id_byte(this, var1);
      }
   }

   public double id_break() {
      return this.id_private;
   }

   public void id_break(double var1, double var3) {
      this.id_catch = var1;
      this.id_private = var3;
      this.id_finally.id_extends();

      for (roS_2 var6 : this.id_native()) {
         var6.id_class(this, var1, var3);
      }
   }

   public void id_break(int var1) {
      this.id_throws = var1;

      for (roS_2 var3 : this.id_native()) {
         var3.id_class(this, var1);
      }
   }

   public double id_throws() {
      return this.id_finally.id_class();
   }

   public long id_finally() {
      return this.id_finally.id_catch();
   }

   public double id_catch() {
      return this.id_finally.id_break();
   }

   public double id_extends() {
      return this.id_finally.id_private();
   }

   public double id_case() {
      return this.id_finally.id_byte();
   }

   public int id_continue() {
      return this.id_case;
   }

   public double id_implements() {
      return this.id_finally.id_throws();
   }

   public int id_new() {
      return this.id_throws;
   }

   public double id_package() {
      return this.id_byte;
   }

   public void id_super() {
      this.id_finally = this.id_finally.id_native();
   }

   public roB_2 id_protected() {
      return this.id_finally.id_implements();
   }

   public double id_private() {
      return this.id_finally.id_protected();
   }

   public double id_final() {
      return this.id_protected;
   }

   public int id_volatile() {
      return this.id_implements;
   }

   protected List<roS_2> id_native() {
      return Lists.newArrayList(this.id_class);
   }
}
