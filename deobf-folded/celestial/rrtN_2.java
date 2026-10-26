package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtN_2 extends rrwI_2 implements MinecraftAccessor, rrtc_3 {
   private static double[] id_class;
   private static byte[] id_break;
   private static float[] id_byte;
   public Object[] id_throws;
   private static short[] id_protected;
   private static boolean[] id_native;

   public void id_boolean() {
      this.id_class();
      boolean var1 = this.aq_();
      if ((Boolean)this.id_throws[9] && !var1) {
         this.ar_();
      }

      Boolean var6 = var1;
      this.id_throws[9] = var6;
   }

   public void id_char() {
      float var1 = id_const.id_volatile() / 2.00001F;
      float var2 = id_const.id_final() / 2.00001F;
      float var3 = this.id_implements() / 2.0F;
      float var4 = this.ao_() / 2.0F;
      this.id_class(var1 - var3, var2 - var4);
   }

   public void id_byte(boolean var1) {
      for (rrtm_3 var3 : this.id_strictfp()) {
         if (!var1 || !this.aq_()) {
            var3.id_native();
         }
      }
   }

   public void id_byte(int var1, int var2, int var3) {
   }

   public abstract String id_byte();

   public void id_int() {
      rrwX_2 var1 = this.id_interface();
      if (var1.id_byte()) {
         this.id_float().id_class(id_native[8]);
         var1.id_class(id_native[9]);
      }

      for (rrtm_3 var3 : this.id_strictfp()) {
         var3.aP_();
      }
   }

   public float id_long() {
      return this.id_float().id_byte();
   }

   public rrNM id_float() {
      this.id_class();
      return (rrNM)this.id_throws[7];
   }

   public float id_double() {
      this.id_class();
      return (Float)((Supplier)this.id_throws[6]).get();
   }

   public rrtN_2(Supplier<Float> var1, Supplier<Float> var2, Supplier<Float> var3, Supplier<Float> var4) {
      this.id_class();
      ArrayList var9 = new ArrayList();
      this.id_throws[id_protected[0]] = var9;
      this.id_throws[3] = var1;
      this.id_throws[4] = var2;
      this.id_throws[5] = var3;
      this.id_throws[6] = var4;
      rrwX_2 var14 = new rrwX_2(this);
      this.id_throws[1] = var14;
      rrws_3 var15 = new rrws_3(this);
      this.id_throws[2] = var15;
      rrNM var16 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F);
      this.id_throws[7] = var16;
   }

   public rrtN_2(Supplier<Float> var1, Supplier<Float> var2, rrNM var3) {
      this(var1, var2);
      this.id_throws[7] = var3;
   }

   public rrtN_2(Supplier<Float> var1, Supplier<Float> var2) {
      this.id_class();
      ArrayList var7 = new ArrayList();
      this.id_throws[id_protected[9]] = var7;
      Supplier var8 = () -> id_byte[22];
      this.id_throws[3] = var8;
      Supplier var9 = () -> id_byte[21];
      this.id_throws[4] = var9;
      this.id_throws[5] = var1;
      this.id_throws[6] = var2;
      rrwX_2 var12 = new rrwX_2(this);
      this.id_throws[1] = var12;
      rrws_3 var13 = new rrws_3(this);
      this.id_throws[2] = var13;
      rrNM var14 = new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[2], 0.3F);
      this.id_throws[7] = var14;
   }

   static {
      ntfClinit();
   }

   public rrwX_2 id_interface() {
      this.id_class();
      return (rrwX_2)this.id_throws[1];
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3) {
      if (var1.id_class(this, var2, var3)) {
         return id_native[23];
      } else {
         float var4 = this.id_default();
         float var5 = this.id_abstract();
         float var6 = this.id_implements();
         return (float)var2 >= var4 && (float)var2 <= var4 + var6 && (float)var3 >= var5 && (float)var3 <= var5 + 13.0F ? true : id_native[25];
      }
   }

   public void id_class(int var1, int var2, int var3) {
      this.id_short().id_case();
      Object var8 = null;
      rrws_3.id_class[id_protected[23]] = var8;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3900549124377365098L;
   }

   public int id_class(List<rrtN_2> var1) {
      return var1.indexOf(this);
   }

   public void id_class(Supplier<Float> var1) {
      this.id_class();
      this.id_throws[6] = var1;
   }

   public rrtN_2 id_class(rrwE_2 var1, float var2, float var3) {
      this.id_class();
      rrwM_2 var8 = new rrwM_2(var1, var2, var3);
      this.id_throws[8] = var8;
      return this;
   }

   public void id_class(Ml_1 var1, float var2) {
      float var3 = 1.0F - var2;
      var1.id_class((double)(var3 * (this.id_default() + this.id_implements() / 2.0F)), (double)(var3 * (this.id_abstract() + this.ao_() / 2.0F)), id_class[0]);
      var1.id_class(var2, var2, 1.0F);
   }

   public rrtN_2 id_class(float var1, float var2) {
      this.id_class();
      if ((rrwM_2)this.id_throws[8] != null) {
         rrwE_2 var3 = ((rrwM_2)this.id_throws[8]).id_break();
         ((rrwM_2)this.id_throws[8]).id_class(var1 - var3.id_class(id_const.id_volatile(), this.id_implements()));
         ((rrwM_2)this.id_throws[8]).id_break(var2 - var3.id_break(id_const.id_final(), this.ao_()));
         return this;
      } else {
         Supplier var8 = () -> var1;
         this.id_throws[3] = var8;
         Supplier var9 = () -> var2;
         this.id_throws[4] = var9;
         return this;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -789043386;
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      return id_native[5];
   }

   public void id_class(rrNM var1) {
      this.id_class();
      this.id_throws[7] = var1;
   }

   private void id_class() {
      if (this.id_throws == null) {
         this.id_throws = new Object[10];
         Object[] var1 = this.id_throws;
         var1[9] = id_native[26];
      }
   }

   public void id_class(rrtu_3 var1) {
      rrwX_2 var2 = this.id_interface();
      var2.id_class(true);
      List var3 = var1.id_class();
      Collections.swap(var3, var3.size() - 1, this.id_class(var3));

      for (rrtm_3 var5 : this.id_strictfp()) {
         var5.id_break();
      }
   }

   public rrtN_2 id_class(rrwE_2 var1) {
      this.id_class();
      float var2 = this.id_default();
      float var3 = this.id_abstract();
      if ((rrwM_2)this.id_throws[8] == null) {
         rrwM_2 var8 = new rrwM_2(var1, id_byte[17], id_byte[18]);
         this.id_throws[8] = var8;
      } else {
         ((rrwM_2)this.id_throws[8]).id_class(var1);
      }

      ((rrwM_2)this.id_throws[8]).id_class(var2 - var1.id_class(id_const.id_volatile(), this.id_implements()));
      ((rrwM_2)this.id_throws[8]).id_break(var3 - var1.id_break(id_const.id_final(), this.ao_()));
      return this;
   }

   public boolean id_class(int var1, int var2) {
      if (!this.aq_()) {
         return id_native[13];
      } else {
         for (rrtm_3 var4 : this.id_strictfp()) {
            if (var4.id_implements()) {
               return true;
            }
         }

         return this.id_transient().id_break((float)var1, (float)var2);
      }
   }

   public boolean id_class(char var1, int var2) {
      return id_native[4];
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_short().id_class(var2, var3, var4);
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.id_class();
      if (var1.id_class(this, var2, var3)) {
         return id_native[1];
      } else {
         this.id_interface().id_break().id_class(var1, var2, var3, var4, var5);
         ((rrws_3)this.id_throws[2]).id_class(var1, var2, var3, var4);

         for (rrtm_3 var8 : this.id_strictfp()) {
            if (var8.id_volatile().id_break((float)var2, (float)var3)) {
               var8.id_class(var1, var2, var3, var4, var6);
               break;
            }
         }

         return id_native[2];
      }
   }

   public float id_default() {
      this.id_class();
      return (rrwM_2)this.id_throws[8] != null
         ? ((rrwM_2)this.id_throws[8]).id_class(id_const.id_volatile(), this.id_implements())
         : (Float)((Supplier)this.id_throws[3]).get();
   }

   public rrws_3 id_short() {
      this.id_class();
      return (rrws_3)this.id_throws[2];
   }

   public void id_void() {
   }

   public void r() {
   }

   public void id_break(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void id_break(Supplier<Float> var1) {
      this.id_class();
      this.id_throws[5] = var1;
   }

   public boolean id_break(rrtu_3 var1, int var2, int var3) {
      if (!this.id_class(var2, var3)) {
         return id_native[15];
      } else {
         return !var1.id_class(this, var2, var3) ? true : id_native[17];
      }
   }

   public boolean id_break(int var1, int var2, int var3) {
      return id_native[3];
   }

   public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_class();
      if (!var5) {
         if (!((List)this.id_throws[id_protected[21]]).isEmpty()) {
            List var6 = this.id_strictfp();

            for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
               rrtm_3 var8 = (rrtm_3)var6.get(var7);
               var8.id_class(var1, var2, var3, var4);
            }

            for (rrtm_3 var10 : var6) {
               var10.id_break(var1, var2, var3, var4);
            }
         }
      }
   }

   public boolean P() {
      return this.id_float().id_protected();
   }

   public abstract String id_catch();

   public boolean id_extends() {
      return true;
   }

   public rrwM_2 id_const() {
      this.id_class();
      return (rrwM_2)this.id_throws[8];
   }

   private static void id_else() {
      id_native = new boolean[]{
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false
      };
   }

   public void id_for() {
   }

   public float id_implements() {
      this.id_class();
      return (Float)((Supplier)this.id_throws[5]).get();
   }

   public float id_import() {
      return 5.0F;
   }

   public void id_instanceof() {
   }

   public boolean id_new() {
      return true;
   }

   private static void id_package() {
      id_break = new byte[]{10, 9};
   }

   private static void id_return() {
      id_class = new double[1];
   }

   private static void id_super() {
      id_byte = new float[]{
         0.3F, 0.3F, 5.0F, 0.0F, 5.0F, 5.0F, 18.0F, 1.0F, 2.0F, 2.0F, 1.0F, 2.00001F, 2.00001F, 2.0F, 2.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 13.0F, 0.0F, 0.0F
      };
   }

   public void id_switch() {
      this.id_class();
      List var1 = (List)this.id_throws[id_protected[19]];

      for (Setting var3 : this.b()) {
         float var4 = (Float)((Supplier)this.id_throws[5]).get();
         rrtm_3 var5 = rrtZ_2.id_class(this, var3, var4);
         if (var3 instanceof GroupSetting) {
            GroupSetting var6 = (GroupSetting)var3;
            List var7 = var6.id_byte();
            var1.add(new rrtC_2(this, var6, 5.0F, id_byte[3], var4 - 5.0F - 5.0F, 18.0F));

            for (Setting var9 : var7) {
               rrtm_3 var10 = rrtZ_2.id_class(this, var9, var4);
               var1.add(var10);
            }
         } else if (var5 != null) {
            var1.add(var5);
         }
      }
   }

   private static void id_while() {
      id_protected = new short[]{
         0,
         3,
         4,
         5,
         6,
         1,
         2,
         2,
         7,
         0,
         3,
         4,
         5,
         6,
         1,
         2,
         2,
         7,
         7,
         0,
         5,
         0,
         2,
         0,
         9,
         9,
         0,
         1,
         2,
         8,
         8,
         3,
         8,
         8,
         4,
         8,
         8,
         8,
         8,
         8,
         8,
         8,
         5,
         6,
         5,
         6,
         7,
         7,
         8,
         8,
         8,
         8,
         3,
         4
      };
   }

   public boolean id_static() {
      return !this.id_interface().id_byte() && !this.id_float().id_case() ? true : id_native[21];
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, -34, -15, 82, 60, 123, -41, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract boolean id_protected();

   public void id_private() {
   }

   public float id_abstract() {
      this.id_class();
      return (rrwM_2)this.id_throws[8] != null
         ? ((rrwM_2)this.id_throws[8]).id_break(id_const.id_final(), this.ao_())
         : (Float)((Supplier)this.id_throws[4]).get();
   }

   public boolean id_final() {
      return true;
   }

   public rruv_1 id_transient() {
      return new rruv_1(this.id_default(), this.id_abstract(), this.id_implements(), this.ao_());
   }

   @Override
   public String id_synchronized() {
      return this.id_catch();
   }

   public List<rrtm_3> id_strictfp() {
      this.id_class();
      return ((List)this.id_throws[id_protected[26]]).stream().filter(rrtm_3::id_throws).toList();
   }

   public void ar_() {
   }

   public boolean ap_() {
      return id_native[22];
   }

   public float au_() {
      return id_byte[16];
   }

   public void as_() {
      this.id_float().id_class(this.id_interface().id_byte());
   }

   public float ao_() {
      float var1 = id_byte[19];

      for (rrtm_3 var3 : this.id_strictfp()) {
         var1 += var3.id_class(var3);
      }

      return this.id_double() + var1;
   }

   public boolean aq_() {
      return !this.id_interface().id_byte() && !this.id_float().id_case() ? id_native[19] : true;
   }

   public void at_() {
   }
}
