package celestial;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rjh_3 extends rja_3 {
   public static int id_byte(long var0) {
      return (int)(var0 << 44 >> 44);
   }

   public static int id_byte(short var0) {
      return var0 >>> 4 & 15;
   }

   public int id_byte() {
      return this.c_();
   }

   public rfH_2 id_int() {
      byte var1 = 8;
      return this.id_package().id_break(8, 8, 8);
   }

   rjh_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public static int id_class(int var0) {
      return var0 >> 4;
   }

   public static int id_class(short var0) {
      return var0 >>> 8 & 15;
   }

   public static Stream<rjh_3> id_class(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.stream(new rjX_2((long)((var3 - var0 + 1) * (var4 - var1 + 1) * (var5 - var2 + 1)), 64, var0, var1, var2, var3, var4, var5), false);
   }

   public static Stream<rjh_3> id_class(rjh_3 var0, int var1) {
      int var2 = var0.id_break();
      int var3 = var0.id_byte();
      int var4 = var0.id_protected();
      return id_class(var2 - var1, var3 - var1, var4 - var1, var2 + var1, var3 + var1, var4 + var1);
   }

   public static long id_class(long var0, rpr_3 var2) {
      return id_class(var0, var2.id_implements(), var2.id_finally(), var2.id_extends());
   }

   public static rjh_3 id_class(int var0, int var1, int var2) {
      return new rjh_3(var0, var1, var2);
   }

   public static rjh_3 id_class(rfj_3 var0, int var1) {
      return new rjh_3(var0.id_break, var1, var0.id_byte);
   }

   public static rjh_3 id_class(an_3 var0) {
      return new rjh_3(id_class(rfU_2.id_byte(var0.rx())), id_class(rfU_2.id_byte(var0.re())), id_class(rfU_2.id_byte(var0.BO())));
   }

   public static rjh_3 id_class(long var0) {
      return new rjh_3(id_break(var0), id_byte(var0), id_protected(var0));
   }

   public static rjh_3 id_class(rfH_2 var0) {
      return new rjh_3(id_class(var0.b_()), id_class(var0.c_()), id_class(var0.d_()));
   }

   public static long id_class(long var0, int var2, int var3, int var4) {
      return id_break(id_break(var0) + var2, id_byte(var0) + var3, id_protected(var0) + var4);
   }

   public static int id_break(int var0) {
      return var0 & 15;
   }

   public static int id_break(long var0) {
      return (int)(var0 << 0 >> 42);
   }

   public int id_break() {
      return this.b_();
   }

   public static long id_break(int var0, int var1, int var2) {
      long var3 = 0L;
      var3 |= ((long)var0 & 4194303L) << 42;
      var3 |= ((long)var1 & 1048575L) << 0;
      return var3 | ((long)var2 & 4194303L) << 20;
   }

   public static int id_break(short var0) {
      return var0 >>> 0 & 15;
   }

   public static Stream<rjh_3> id_break(rfj_3 var0, int var1) {
      int var2 = var0.id_break;
      int var3 = var0.id_byte;
      return id_class(var2 - var1, 0, var3 - var1, var2 + var1, 15, var3 + var1);
   }

   public static short id_break(rfH_2 var0) {
      int var1 = id_break(var0.b_());
      int var2 = id_break(var0.c_());
      int var3 = id_break(var0.d_());
      return (short)(var1 << 8 | var3 << 4 | var2 << 0);
   }

   public int id_throws(short var1) {
      return this.id_finally() + id_break(var1);
   }

   public static long id_throws(long var0) {
      return id_break(id_class(rfH_2.id_class(var0)), id_class(rfH_2.id_break(var0)), id_class(rfH_2.id_byte(var0)));
   }

   public int id_finally() {
      return this.id_byte() << 4;
   }

   public static int id_catch(int var0) {
      return var0 << 4;
   }

   public rfH_2 id_catch(short var1) {
      return new rfH_2(this.id_protected(var1), this.id_throws(var1), this.id_case(var1));
   }

   public int id_extends() {
      return this.id_protected() << 4;
   }

   public static long id_case(long var0) {
      return var0 & -1048576L;
   }

   public int id_case(short var1) {
      return this.id_extends() + id_byte(var1);
   }

   public long id_continue() {
      return id_break(this.id_break(), this.id_byte(), this.id_protected());
   }

   public rfj_3 id_new() {
      return new rfj_3(this.id_break(), this.id_protected());
   }

   public rfH_2 id_package() {
      return new rfH_2(id_catch(this.id_break()), id_catch(this.id_byte()), id_catch(this.id_protected()));
   }

   public Stream<rfH_2> id_super() {
      return rfH_2.id_class(this.id_private(), this.id_finally(), this.id_extends(), this.id_native(), this.id_volatile(), this.id_final());
   }

   public int id_protected() {
      return this.d_();
   }

   public int id_protected(short var1) {
      return this.id_private() + id_class(var1);
   }

   public static int id_protected(long var0) {
      return (int)(var0 << 22 >> 42);
   }

   public int id_private() {
      return this.id_break() << 4;
   }

   public int id_final() {
      return (this.id_protected() << 4) + 15;
   }

   public int id_volatile() {
      return (this.id_byte() << 4) + 15;
   }

   public int id_native() {
      return (this.id_break() << 4) + 15;
   }
}
