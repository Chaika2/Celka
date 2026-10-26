package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtO_2 implements MinecraftAccessor {
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public static Object[] id_break;
   private static long[] id_case;
   private static float[] id_catch;

   public boolean id_byte() {
      return !this.id_synchronized() && !((rrNM)this.id_class[id_throws[17]]).id_case() ? id_protected[2] : id_protected[3];
   }

   public long id_int() {
      return (Long)this.id_class[id_throws[34]];
   }

   public rrtO_2(rrtX_2 var1, rVi_1 var2, rVi_1 var3, int var4) {
      this.id_public();
      rrNM var9 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[0]], id_catch[0]);
      this.id_class[id_throws[1]] = var9;
      AnimValue var10 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[2]], id_catch[1], id_protected[0]);
      this.id_class[id_throws[3]] = var10;
      rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[4]]).id_case();
      this.id_class[id_throws[5]] = var11;
      rrZO var12 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[6]]).id_class();
      this.id_class[id_throws[7]] = var12;
      Boolean var13 = id_protected[1];
      this.id_class[id_throws[8]] = var13;
      this.id_class[id_throws[9]] = var1;
      this.id_class[id_throws[10]] = var2;
      this.id_class[id_throws[11]] = var3;
      Integer var17 = var4;
      this.id_class[id_throws[12]] = var17;
      Long var18 = rqR_2.id_break();
      this.id_class[id_throws[13]] = var18;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new byte[]{5, 16, 10, 7, 8, 9};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8890936727509582996L;
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_throws[37]] = var6;
   }

   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5) {
      ((rrNM)this.id_class[id_throws[14]]).id_class(this.id_synchronized());
      ((AnimValue)this.id_class[id_throws[15]])
         .id_break((float)((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[16]]).id_break().indexOf(this));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 191644962;
   }

   public boolean id_class() {
      return (Boolean)this.id_class[id_throws[36]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 73, 85, -48, 114, 38, 126, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break() {
   }

   public rqA_2 id_throws() {
      return rqn_3.zJ;
   }

   public float id_finally() {
      return id_catch[4];
   }

   public rrZO id_catch() {
      return (rrZO)this.id_class[id_throws[32]];
   }

   public float id_extends() {
      float var1 = id_const.id_volatile();
      float var2 = this.id_native();
      float var3 = this.id_package();
      return var1 + -(var2 + id_catch[2]) * var3;
   }

   private static void id_goto() {
      Object[] var0 = new Object[]{0.0F};
      id_break = var0;
   }

   public int id_case() {
      return (int)(Math.min(this.id_package(), id_catch[6]) * id_catch[7]);
   }

   public AnimValue id_continue() {
      return (AnimValue)this.id_class[id_throws[28]];
   }

   private static void id_else() {
      id_throws = new short[]{2, 0, 2, 1, 0, 5, 0, 6, 9, 2, 3, 4, 8, 7, 0, 1, 0, 0, 7, 8, 1, 56, 0, 5, 3, 6, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
   }

   public rrZO id_implements() {
      return (rrZO)this.id_class[id_throws[33]];
   }

   private static void id_instanceof() {
      id_case = new long[1];
   }

   public rVi_1 id_new() {
      return (rVi_1)this.id_class[id_throws[31]];
   }

   public float id_package() {
      return this.id_protected().id_byte();
   }

   private float id_return() {
      byte var1 = id_byte[0];
      if ((gm_3)id_import.id_class[id_throws[21]] == null) {
         return (float)var1;
      } else {
         Hud var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[22]]).id_private().w();
         return var2.id_new() + var2.id_while() + (float)var1;
      }
   }

   public float id_super() {
      float var1 = id_const.id_final() - this.id_finally();
      float var2 = this.id_finally() + id_catch[3];
      float var3 = ((AnimValue)this.id_class[id_throws[20]]).id_byte();
      return var1 - this.id_return() - var2 * var3;
   }

   private static void id_try() {
      id_protected = new boolean[]{false, true, true, false, true, false, false, false, true, false};
   }

   private static void id_while() {
      id_catch = new float[]{0.3F, 0.3F, 5.0F, 7.0F, 25.0F, 10.0F, 1.0F, 255.0F, 7.0F};
   }

   private void id_public() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[2]];
         Object[] var1 = this.id_class;
         var1[id_byte[3]] = id_case[0];
         var1[id_byte[4]] = Integer.valueOf(id_protected[6]);
         var1[id_byte[5]] = id_protected[7];
      }
   }

   public rrNM id_protected() {
      return (rrNM)this.id_class[id_throws[27]];
   }

   public int id_private() {
      return (Integer)this.id_class[id_throws[35]];
   }

   public rrtX_2 id_final() {
      return (rrtX_2)this.id_class[id_throws[29]];
   }

   public rVi_1 id_volatile() {
      return (rVi_1)this.id_class[id_throws[30]];
   }

   private boolean id_synchronized() {
      return rqR_2.id_break() - this.id_class[id_throws[18]] < (long)((Integer)this.id_class[id_throws[19]]).intValue() ? id_protected[4] : id_protected[5];
   }

   public float id_native() {
      byte var1 = id_byte[1];
      return id_catch[5]
         + Math.max(
            ((rrZO)this.id_class[id_throws[23]]).id_break(((rVi_1)this.id_class[id_throws[24]]).id_byte()) + (float)var1,
            ((rrZO)this.id_class[id_throws[25]]).id_break(((rVi_1)this.id_class[id_throws[26]]).id_byte())
         );
   }
}
