package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Module extends rrwI_2 implements MinecraftAccessor {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;

   public void id_byte(boolean var1) {
      this.id_goto();
      if ((Boolean)this.id_class[id_byte[15]]) {
         this.id_throws(var1);
         this.id_volatile();
      }
   }

   public void id_byte() {
   }

   public Category id_int() {
      this.id_goto();
      return (Category)this.id_class[id_byte[32]];
   }

   public Module(String var1, KeyBind var2) {
      this.id_goto();
      ArrayList var7 = new ArrayList();
      this.id_class[id_byte[9]] = var7;
      this.id_class[id_byte[10]] = var1;
      this.id_class[id_byte[11]] = var2;
   }

   public Module(String var1, String var2, Category var3, KeyBind var4) {
      this.id_goto();
      ArrayList var9 = new ArrayList();
      this.id_class[id_byte[0]] = var9;
      this.id_class[id_byte[1]] = var1;
      String var11 = var1.toLowerCase();
      this.id_class[id_byte[2]] = var11;
      this.id_class[id_byte[3]] = var4;
      this.id_class[id_byte[4]] = var4;
      this.id_class[id_byte[5]] = var2;
      this.id_class[id_byte[6]] = var3;
      ((List)this.id_class[id_byte[7]]).add(new rrTL());
      if (this instanceof rrnv_3) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_finally().id_break(this);
      }
   }

   public Module(String var1, String var2, Category var3) {
      this(var1, var2, var3, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[12]]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1557518106;
   }

   public void id_class(KeyBind var1, boolean var2) {
      this.id_goto();
      this.id_class[id_byte[25]] = var1;
      if (var2) {
         ((List)this.id_class[id_byte[26]]).forEach(var2x -> var2x.id_class(this, var1));
      }
   }

   public void id_class(boolean var1, boolean var2) {
      this.id_goto();
      Boolean var7 = var1;
      this.id_class[id_byte[27]] = var7;
      if (var2) {
         ((List)this.id_class[id_byte[28]]).forEach(var2x -> var2x.id_class(this, var1));
      }
   }

   public void id_class(boolean var1) {
      this.id_goto();
      if (var1) {
         ((List)this.id_class[id_byte[22]]).forEach(var1x -> var1x.id_class(this));
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, 126, -75, 68, -65, 64, -8, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4463582562046162875L;
   }

   public void id_break(boolean var1) {
      this.id_goto();
      if (this instanceof rrnv_3) {
         this.id_byte(id_break[2]);
      } else if (!(Boolean)this.id_class[id_byte[14]]) {
         this.av_();
         this.id_class(var1);
      }
   }

   public List<rrTv_1> id_throws() {
      this.id_goto();
      return (List<rrTv_1>)this.id_class[id_byte[36]];
   }

   public void id_throws(boolean var1) {
      this.id_goto();
      if (var1) {
         ((List)this.id_class[id_byte[23]]).forEach(var1x -> var1x.id_break(this));
      }
   }

   public void id_finally() {
   }

   public String id_extends() {
      this.id_goto();
      return (String)this.id_class[id_byte[29]];
   }

   private void id_goto() {
      if (this.id_class == null) {
         this.id_class = new Object[9];
         this.id_class[6] = false;
         this.id_class[7] = false;
      }
   }

   public rVi_1 id_case() {
      return new rVe_1(this.id_final());
   }

   private static void id_else() {
      id_byte = new short[]{8, 0, 1, 4, 5, 2, 3, 8, 0, 8, 0, 4, 0, 6, 6, 6, 6, 0, 6, 6, 6, 0, 8, 8, 0, 4, 8, 7, 8, 0, 1, 2, 3, 5, 6, 7, 8, 4, 6};
   }

   public boolean id_implements() {
      this.id_goto();
      return (Boolean)this.id_class[id_byte[35]];
   }

   public KeyBind id_package() {
      this.id_goto();
      return (KeyBind)this.id_class[id_byte[37]];
   }

   private static void id_return() {
      id_protected = new byte[]{9, 6, 7};
   }

   private static void id_public() {
      id_break = new boolean[]{true, true, false, true, false, false, false};
   }

   public void id_protected(boolean var1) {
      this.id_goto();
      Boolean var6 = var1;
      this.id_class[id_byte[38]] = var6;
   }

   public String id_final() {
      this.id_goto();
      return (String)this.id_class[id_byte[24]];
   }

   public void id_volatile() {
      this.id_goto();
      if ((Boolean)this.id_class[id_byte[19]]) {
         Boolean var5 = id_break[4];
         this.id_class[id_byte[20]] = var5;
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[21]]).id_finally().id_byte(this);
      }
   }

   @Override
   public String id_synchronized() {
      return this.id_final();
   }

   public boolean aJ_() {
      this.id_goto();
      return (Boolean)this.id_class[id_byte[34]];
   }

   public void aw_() {
      this.id_goto();
      if (!(this instanceof rrnv_3)) {
         if ((Boolean)this.id_class[id_byte[13]]) {
            this.id_byte(id_break[0]);
         } else {
            this.id_break(id_break[1]);
         }
      }
   }

   public void av_() {
      this.id_goto();
      if (!(Boolean)this.id_class[id_byte[16]]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[17]]).id_finally().id_break(this);
         Boolean var5 = id_break[3];
         this.id_class[id_byte[18]] = var5;
      }
   }

   public KeyBind ax_() {
      this.id_goto();
      return (KeyBind)this.id_class[id_byte[33]];
   }

   public String ay_() {
      this.id_goto();
      return (String)this.id_class[id_byte[31]];
   }

   public String aH_() {
      this.id_goto();
      return (String)this.id_class[id_byte[30]];
   }
}
