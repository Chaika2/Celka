package celestial;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rjh_3 extends rja_3 {
   public static int byte_(long var0) {
      return (int)(var0 << 44 >> 44);
   }

   public static int byte_(short var0) {
      return var0 >>> 4 & 15;
   }

   public int byte_() {
      return this.c_();
   }

   public rfH_2 int_() {
      byte var1 = 8;
      return this.package_().break_(8, 8, 8);
   }

   rjh_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public static int class_(int var0) {
      return var0 >> 4;
   }

   public static int class_(short var0) {
      return var0 >>> 8 & 15;
   }

   public static Stream<rjh_3> class_(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.stream(new rjX_2((long)((var3 - var0 + 1) * (var4 - var1 + 1) * (var5 - var2 + 1)), 64, var0, var1, var2, var3, var4, var5), false);
   }

   public static Stream<rjh_3> class_(rjh_3 var0, int var1) {
      int var2 = var0.break_();
      int var3 = var0.byte_();
      int var4 = var0.protected_();
      return class_(var2 - var1, var3 - var1, var4 - var1, var2 + var1, var3 + var1, var4 + var1);
   }

   public static long class_(long var0, rpr_3 var2) {
      return class_(var0, var2.implements_(), var2.finally_(), var2.extends_());
   }

   public static rjh_3 class_(int var0, int var1, int var2) {
      return new rjh_3(var0, var1, var2);
   }

   public static rjh_3 class_(rfj_3 var0, int var1) {
      return new rjh_3(var0.break_, var1, var0.byte_);
   }

   public static rjh_3 class_(an_3 var0) {
      return new rjh_3(class_(rfU_2.byte_(var0.rx())), class_(rfU_2.byte_(var0.re())), class_(rfU_2.byte_(var0.BO())));
   }

   public static rjh_3 class_(long var0) {
      return new rjh_3(break_(var0), byte_(var0), protected_(var0));
   }

   public static rjh_3 class_(rfH_2 var0) {
      return new rjh_3(class_(var0.b_()), class_(var0.c_()), class_(var0.d_()));
   }

   public static long class_(long var0, int var2, int var3, int var4) {
      return break_(break_(var0) + var2, byte_(var0) + var3, protected_(var0) + var4);
   }

   public static int break_(int var0) {
      return var0 & 15;
   }

   public static int break_(long var0) {
      return (int)(var0 << 0 >> 42);
   }

   public int break_() {
      return this.b_();
   }

   public static long break_(int var0, int var1, int var2) {
      long var3 = 0L;
      var3 |= ((long)var0 & 4194303L) << 42;
      var3 |= ((long)var1 & 1048575L) << 0;
      return var3 | ((long)var2 & 4194303L) << 20;
   }

   public static int break_(short var0) {
      return var0 >>> 0 & 15;
   }

   public static Stream<rjh_3> break_(rfj_3 var0, int var1) {
      int var2 = var0.break_;
      int var3 = var0.byte_;
      return class_(var2 - var1, 0, var3 - var1, var2 + var1, 15, var3 + var1);
   }

   public static short break_(rfH_2 var0) {
      int var1 = break_(var0.b_());
      int var2 = break_(var0.c_());
      int var3 = break_(var0.d_());
      return (short)(var1 << 8 | var3 << 4 | var2 << 0);
   }

   public int throws_(short var1) {
      return this.finally_() + break_(var1);
   }

   public static long throws_(long var0) {
      return break_(class_(rfH_2.class_(var0)), class_(rfH_2.break_(var0)), class_(rfH_2.byte_(var0)));
   }

   public int finally_() {
      return this.byte_() << 4;
   }

   public static int catch_(int var0) {
      return var0 << 4;
   }

   public rfH_2 catch_(short var1) {
      return new rfH_2(this.protected_(var1), this.throws_(var1), this.case_(var1));
   }

   public int extends_() {
      return this.protected_() << 4;
   }

   public static long case_(long var0) {
      return var0 & -1048576L;
   }

   public int case_(short var1) {
      return this.extends_() + byte_(var1);
   }

   public long continue_() {
      return break_(this.break_(), this.byte_(), this.protected_());
   }

   public rfj_3 new_() {
      return new rfj_3(this.break_(), this.protected_());
   }

   public rfH_2 package_() {
      return new rfH_2(catch_(this.break_()), catch_(this.byte_()), catch_(this.protected_()));
   }

   public Stream<rfH_2> super_() {
      return rfH_2.class_(this.private_(), this.finally_(), this.extends_(), this.native_(), this.volatile_(), this.final_());
   }

   public int protected_() {
      return this.d_();
   }

   public int protected_(short var1) {
      return this.private_() + class_(var1);
   }

   public static int protected_(long var0) {
      return (int)(var0 << 22 >> 42);
   }

   public int private_() {
      return this.break_() << 4;
   }

   public int final_() {
      return (this.protected_() << 4) + 15;
   }

   public int volatile_() {
      return (this.byte_() << 4) + 15;
   }

   public int native_() {
      return (this.break_() << 4) + 15;
   }
}
