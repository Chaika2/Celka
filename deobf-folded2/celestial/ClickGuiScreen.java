package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickGuiScreen extends vm_3 implements Zg_1, rrZF, rrZv_1, rrvE {
   private static short[] id_else;
   private static String[] id_synchronized;
   private static boolean[] id_return;
   private static byte[] id_public;
   public static Object[] id_class;
   private static float[] id_goto;
   public Object[] id_throws;

   public void id_char() {
      this.id_default();
      Integer var5 = id_const.id_extends() / 4 - 181;
      this.id_throws[4] = var5;
      Integer var6 = id_const.id_native() / 4 - 150;
      this.id_throws[5] = var6;
   }

   @Override
   public void id_byte(boolean var1) {
      this.id_default();
      Boolean var6 = var1;
      this.id_throws[3] = var6;
   }

   @Override
   public rdn_3 id_byte() {
      this.id_default();
      return ((rrvJ)this.id_throws[0]).ag_();
   }

   public void id_int() {
      this.id_continue();
      id_import.id_break(this);
   }

   public boolean id_long() {
      this.id_default();
      return (Boolean)this.id_throws[3];
   }

   public void id_float() {
      rrIJ var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_catch();
      var1.id_catch();
   }

   public ClickGuiScreen() {
      super(rgP_2.id_byte("ClickGUI"));
      this.id_default();
      rrNM var5 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F);
      this.id_throws[2] = var5;
      id_class[0] = this;
      rrvJ var7 = new rrvJ(this, (rrtu_3)id_class[1]);
      this.id_throws[0] = var7;
      rrvS var8 = new rrvS(this);
      this.id_throws[1] = var8;
   }

   static {
      ntfClinit();
   }

   public rrvJ id_interface() {
      this.id_default();
      return (rrvJ)this.id_throws[0];
   }

   public void id_class(rrFK var1) {
      this.id_default();
      ((rrvJ)this.id_throws[0]).id_class(var1);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      this.id_default();
      ((rrvJ)this.id_throws[0]).id_break((Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5);
      ((rrvS)this.id_throws[1]).id_class(var5);
      ((rrtu_3)id_class[1]).id_class((int)var1, (int)var3, var5);
      return super.id_class(var1, var3, var5);
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      this.id_default();
      ((rrvJ)this.id_throws[0]).id_class((rrtu_3)id_class[1], (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5, (Boolean)this.id_throws[3]);
      ((rrtu_3)id_class[1]).id_class((rrtu_3)id_class[1], (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5, true, (Boolean)this.id_throws[3]);
      return super.id_class(var1, var3, var5);
   }

   public boolean id_class(int var1, int var2) {
      this.id_default();
      return var1 >= this.id_throws[4] && var1 <= this.id_throws[4] + 100 && var2 >= this.id_throws[5] && var2 <= this.id_throws[5] + 30 ? true : id_return[13];
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_default();
      ((rrvJ)this.id_throws[0]).id_class(var1, var2, var3);
      ((rrtu_3)id_class[1]).id_byte(var1, var2, var3);
      boolean var4 = super.id_class(var1, var2, var3);
      ((rrvJ)this.id_throws[0]).id_byte(var1, var2, var3);
      ((rrtu_3)id_class[1]).id_break(var1, var2, var3);
      return var4;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4178018201638223632L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_default();
      if (ClickGuiTheme.id_throws() || !(Boolean)this.id_throws[3]) {
         if (!(Boolean)this.id_throws[3]) {
            ((rrNM)this.id_throws[2]).id_class(!this.id_public() ? true : id_return[1]);
         }

         rrvk_1.id_class(
            var1,
            () -> rrfD_2.id_protected(var1, 0.0F, 0.0F, (float)id_const.id_new(), (float)id_const.id_continue(), -1),
            (float)Math.max(1, (int)(10.0F * ((rrNM)this.id_throws[2]).id_byte()))
         );
         var1.id_class();
         rrQo_1.id_class(
            var1,
            (float)((Integer)this.id_throws[4]).intValue(),
            (float)((Integer)this.id_throws[5]).intValue(),
            363.0F,
            300.0F,
            ((rrNM)this.id_throws[2]).id_byte()
         );
         ((rrvS)this.id_throws[1]).id_class((Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1]);
         ((rrvJ)this.id_throws[0])
            .id_class(
               var1,
               (rrtu_3)id_class[1],
               (float)((Integer)this.id_throws[4]).intValue(),
               (float)((Integer)this.id_throws[5]).intValue(),
               363.0F,
               300.0F,
               (Integer)rrvk_1.id_class[0],
               (Integer)rrvk_1.id_class[1],
               true
            );
         ((rrtu_3)id_class[1]).id_class(var1, (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], (Boolean)this.id_throws[3]);
         var1.id_break();
         super.id_class(var1, var2, var3, var4);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 4, -36, 95, 92, -4, -105, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(float var1, float var2) {
      this.id_default();
      Integer var7 = (int)var1;
      this.id_throws[4] = var7;
      Integer var8 = (int)var2;
      this.id_throws[5] = var8;
   }

   @Override
   public boolean id_class(char var1, int var2) {
      this.id_default();
      ((rrvJ)this.id_throws[0]).id_class(var1, var2);
      ((rrtu_3)id_class[1]).id_class(var1, var2);
      return super.id_class(var1, var2);
   }

   private void id_default() {
      if (this.id_throws == null) {
         this.id_throws = new Object[6];
         Object[] var1 = this.id_throws;
         var1[3] = false;
         var1[4] = 0;
         var1[5] = 0;
      }
   }

   private static void id_short() {
      id_return = new boolean[]{
         true, false, true, true, true, true, false, true, false, false, false, false, true, false, true, false, true, false, false, false
      };
   }

   private static void id_void() {
      id_goto = new float[]{0.3F, 10.0F, 363.0F, 300.0F, 363.0F, 300.0F, 0.0F, 0.0F};
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_default();
      ((rrvJ)this.id_throws[0]).id_class((rrtu_3)id_class[1], (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5, true);
      ((rrvS)this.id_throws[1]).id_class((rrtu_3)id_class[1], (Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5, true);
      ((rrtu_3)id_class[1]).id_class((Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5, false, (Boolean)this.id_throws[3]);
      return super.id_break(var1, var3, var5);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1680184854;
   }

   public int id_finally() {
      this.id_default();
      return (Integer)this.id_throws[5];
   }

   private static void id_const() {
      Object[] var0 = new Object[]{null, new rrtu_3(), new rqO_2("shaders/post/desaturate.json")};
      id_class = var0;
   }

   private static void id_import() {
      id_public = new byte[]{100, 30, 4, 4, -1, 2, 6, 3, 4, 5, 3};
   }

   @Override
   public rrNG id_package() {
      this.id_default();
      return (rrNM)this.id_throws[2];
   }

   @Override
   public void id_try() {
      this.id_default();
      super.id_try();
      ((rrtu_3)id_class[1]).id_catch();
      ((rrvS)this.id_throws[1]).id_class(false);
   }

   private static void id_static() {
      id_synchronized = new String[]{new String("ClickGUI"), new String("shaders/post/desaturate.json")};
   }

   @Override
   public void id_private() {
      this.id_default();
      super.id_private();
      ((rrvJ)this.id_throws[0]).id_protected();
      ((rrtu_3)id_class[1]).id_private();
   }

   public int id_abstract() {
      this.id_default();
      return (Integer)this.id_throws[4];
   }

   @Override
   public boolean id_final() {
      return this.id_public() && !this.id_package().id_case() ? true : id_return[15];
   }

   public rrvS id_native() {
      this.id_default();
      return (rrvS)this.id_throws[1];
   }

   private static void id_strictfp() {
      id_else = new short[]{
         2,
         2,
         0,
         1,
         0,
         1,
         1,
         0,
         3,
         3,
         2,
         2,
         4,
         5,
         2,
         1,
         0,
         1,
         0,
         1,
         4,
         5,
         0,
         1,
         1,
         0,
         1,
         3,
         0,
         1,
         0,
         1,
         1,
         1,
         0,
         1,
         1,
         0,
         1,
         3,
         0,
         1,
         0,
         1,
         3,
         1,
         1,
         0,
         1,
         3,
         0,
         1,
         0,
         1,
         0,
         0,
         1,
         1,
         1,
         0,
         1,
         0,
         1,
         2,
         1,
         1,
         1,
         0,
         1,
         0,
         0,
         4,
         4,
         5,
         5,
         4,
         5,
         181,
         4,
         150,
         5,
         0,
         2,
         0,
         0,
         1,
         3,
         3,
         4,
         5
      };
   }

   @Override
   public boolean E_() {
      return ((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).id_break() ? false : super.E_();
   }

   @Override
   public void v_() {
      this.id_default();
      super.v_();
      this.id_char();
      ((rrtu_3)id_class[1]).id_break();
      ((rrvJ)this.id_throws[0]).id_catch();
      this.id_float();
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      this.id_default();
      super.w_();
      ((rrvJ)this.id_throws[0]).id_private();
      ((rrtu_3)id_class[1]).id_catch();
      ((rrNM)this.id_throws[2]).id_break();
      ((rrvS)this.id_throws[1]).id_class(false);
   }
}
