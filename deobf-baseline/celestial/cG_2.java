package celestial;

import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class cG_2 extends rhd_3 implements rrce_3 {
   private static boolean[] id_break;
   private static double[] id_finally;
   private static short[] id_extends;
   private static String[] id_native;
   private static float[] id_volatile;
   private static byte[] id_final;
   public Object[] id_class;

   private static void id_boolean() {
      id_finally = new double[]{1.0, 2.0};
   }

   @Override
   public void id_byte() {
      if (this.id_catch()) {
         this.id_class(this);
      }

      super.id_byte();
   }

   public rqO_2 id_int() {
      this.id_long();
      return (rqO_2)this.id_class[id_extends[21]];
   }

   private void id_long() {
      if (this.id_class == null) {
         this.id_class = new Object[id_final[0]];
         Object[] var1 = this.id_class;
         var1[id_final[1]] = id_volatile[10];
         var1[id_final[2]] = id_volatile[11];
         var1[id_final[3]] = id_volatile[12];
         var1[id_final[4]] = id_break[19];
         var1[id_final[5]] = id_volatile[13];
         var1[id_final[6]] = id_volatile[14];
         var1[id_final[7]] = id_volatile[15];
      }
   }

   private static void id_float() {
      id_volatile = new float[]{1.0F, 1.1F, 0.0F, 1.0F, 20.0F, 1.0F, 1.0F, 1.0F, 0.15F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public cG_2(gm_3 var1, GameProfile var2) {
      super(var1, var1.id_this(), var1.id_else(), var2);
      this.id_long();
      Object var7 = null;
      this.id_class[id_extends[0]] = var7;
      Boolean var8 = id_break[0];
      this.id_class[id_extends[1]] = var8;
      this.id_class[id_extends[2]] = var1;
      String var10 = var2.getName();
      this.id_class[id_extends[3]] = var10;
      if ((String)this.id_class[id_extends[4]] != null && !((String)this.id_class[id_extends[5]]).isEmpty()) {
         String var11 = rql_3.id_class((String)this.id_class[id_extends[6]]);
         this.id_class[id_extends[7]] = var11;
      }
   }

   static {
      ntfClinit();
   }

   public static fd_3 id_class(rqO_2 var0, String var1) {
      fY_2 var2 = QY.id_instanceof().A();
      Object var3 = var2.id_break(var0);
      if (var3 == null) {
         File var10002 = (File)null;
         String var10003 = id_native[0];
         Object[] var10004 = new Object[id_break[11]];
         var10004[id_break[12]] = rql_3.id_class(var1);
         var3 = new fd_3(var10002, String.format(var10003, var10004), jH_2.id_class(id_extends(var1)), id_break[13], (Runnable)null);
         var2.id_class(var0, (ff_3)var3);
      }

      return (fd_3)var3;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 292525767;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8132444906704134603L;
   }

   @Override
   public void id_class(rruO var1) {
      this.id_long();
      this.id_class[id_extends[29]] = var1;
   }

   public static rqO_2 id_class(String var0) {
      return new rqO_2("skins/" + Hashing.sha1().hashUnencodedChars(rql_3.id_class(var0)));
   }

   public void id_class(boolean var1) {
      this.id_long();
      Boolean var6 = var1;
      this.id_class[id_extends[25]] = var6;
   }

   public void id_class(rqO_2 var1) {
      this.id_long();
      this.id_class[id_extends[22]] = var1;
   }

   private static void id_short() {
      id_break = new boolean[]{
         false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, false, true, true, false, false
      };
   }

   public String id_break() {
      Aw_1 var1 = this.id_continue();
      return var1 == null ? jH_2.id_break(this.ro()) : var1.id_throws();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -78, -125, 96, 13, 77, -76, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rruO id_throws() {
      this.id_long();
      return (rruO)this.id_class[id_extends[28]];
   }

   public boolean id_finally() {
      Aw_1 var1 = this.id_continue();
      return var1 != null && var1.id_protected() ? id_break[7] : id_break[8];
   }

   public boolean id_catch() {
      return this.id_case() == (rqO_2)rhd_3.id_protected[id_extends[27]] ? id_break[17] : id_break[18];
   }

   @Override
   public String id_extends() {
      this.id_long();
      return (String)this.id_class[id_extends[20]];
   }

   public rqO_2 id_case() {
      this.id_long();
      if (!rrbb_3.e()) {
         return null;
      } else if (this == (cb_3)QY.id_instanceof().id_class[id_extends[11]]
         || ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_extends[12]]).id_class(this)) {
         return (rqO_2)rhd_3.id_protected[id_extends[13]];
      } else if ((rqO_2)this.id_class[id_extends[14]] != null) {
         return (rqO_2)this.id_class[id_extends[15]];
      } else {
         Aw_1 var1 = this.id_continue();
         return var1 == null ? null : var1.id_catch();
      }
   }

   public Aw_1 id_continue() {
      this.id_long();
      if ((Aw_1)this.id_class[id_extends[8]] == null) {
         Aw_1 var5 = QY.id_instanceof().id_void().id_class(this.ro());
         this.id_class[id_extends[9]] = var5;
      }

      return (Aw_1)this.id_class[id_extends[10]];
   }

   private static void id_else() {
      id_extends = new short[]{6, 7, 5, 8, 8, 8, 8, 8, 1, 1, 1, 57, 0, 8, 6, 6, 18, 18, 18, 20, 8, 6, 6, 6, 7, 7, 7, 8, 0, 0};
   }

   @Override
   public boolean id_implements() {
      Aw_1 var1 = QY.id_instanceof().id_void().id_class(this.sv().getId());
      return var1 != null && var1.id_break() == rRl_1.CREATIVE ? id_break[3] : id_break[4];
   }

   public float id_new() {
      float var1 = id_volatile[0];
      if (((rhx_3)this.id_implements[id_extends[16]]).id_break) {
         var1 *= id_volatile[1];
      }

      var1 = (float)(
         (double)var1 * ((this.id_class(iQ_2.id_protected) / (double)((rhx_3)this.id_implements[id_extends[17]]).id_break() + id_finally[0]) / id_finally[1])
      );
      if (((rhx_3)this.id_implements[id_extends[18]]).id_break() == id_volatile[2] || Float.isNaN(var1) || Float.isInfinite(var1)) {
         var1 = id_volatile[3];
      }

      if (this.id_return() && this.sX().id_break() instanceof rxQ_2) {
         int var2 = this.SU();
         float var3 = (float)var2 / id_volatile[4];
         if (var3 > id_volatile[5]) {
            var3 = id_volatile[6];
         } else {
            var3 *= var3;
         }

         var1 *= id_volatile[7] - var3 * id_volatile[8];
      }

      float var10001 = id_volatile[9];
      return rfU_2.id_catch(((Qw_1)QY.id_instanceof().id_class[id_extends[19]]).e, var10001, var1);
   }

   public boolean id_package() {
      this.id_long();
      rqO_2 var1 = this.id_case();
      if (this.id_catch()) {
         return id_break[14];
      } else if (var1 == null) {
         return id_break[15];
      } else {
         return var1 == (rqO_2)this.id_class[id_extends[23]] ? (Boolean)this.id_class[id_extends[24]] : id_break[16];
      }
   }

   public boolean id_super() {
      return this.id_continue() != null ? id_break[5] : id_break[6];
   }

   private static void id_static() {
      id_final = new byte[]{14, 2, 3, 4, 7, 11, 12, 13};
   }

   private static void id_public() {
      id_native = new String[]{new String("http://skins.minecraft.net/MinecraftSkins/%s.png")};
   }

   public boolean id_protected() {
      return this.id_continue() != null ? id_break[9] : id_break[10];
   }

   public boolean id_private() {
      this.id_long();
      return (Boolean)this.id_class[id_extends[26]];
   }

   public rqO_2 id_final() {
      Aw_1 var1 = this.id_continue();
      return var1 == null ? jH_2.id_class(this.ro()) : var1.id_case();
   }

   public rqO_2 id_volatile() {
      Aw_1 var1 = this.id_continue();
      return var1 == null ? null : var1.id_private();
   }

   @Override
   public boolean id_native() {
      Aw_1 var1 = QY.id_instanceof().id_void().id_class(this.sv().getId());
      return var1 != null && var1.id_break() == rRl_1.SPECTATOR ? id_break[1] : id_break[2];
   }
}
