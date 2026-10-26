package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIv_1 extends Setting<String> {
   private static float[] id_byte;
   private static byte[] id_protected;
   public Object[] id_break;
   private static String[] id_throws;
   private static boolean[] id_case;
   private static short[] id_catch;

   private static void id_int() {
      id_throws = new String[]{new String(""), new String("")};
   }

   public rrIv_1(String var1, rrte_3 var2) {
      this(var1, id_throws[0], var2);
      this.id_class(id_byte[0]);
      this.id_package();
   }

   public rrIv_1(String var1, String var2, rrte_3 var3) {
      super(var1, var2);
      this.id_super();
      Float var8 = id_byte[1];
      this.id_break[id_catch[0]] = var8;
      this.id_break(() -> var1);
      this.id_byte(this.id_native().get());
      String var9 = this.id_break[id_catch[1]] ? id_throws[1] : var2;
      this.id_break[id_catch[2]] = var9;
      this.id_break[id_catch[3]] = var3;
      this.id_break[id_catch[4]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new byte[]{7, 5, 6};
   }

   public rrIv_1 id_class(float var1) {
      this.id_super();
      Float var6 = var1;
      this.id_break[id_catch[7]] = var6;
      return this;
   }

   public rrIv_1 id_class(Object var1) {
      this.id_super();
      this.id_break[id_catch[11]] = var1;
      return this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2131739900;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5232488641224152531L;
   }

   public void id_class(rrtY_2 var1) {
      this.id_super();
      this.id_break[id_catch[14]] = var1;
   }

   public rrtY_2 id_class() {
      this.id_super();
      return (rrtY_2)this.id_break[id_catch[13]];
   }

   public Object id_break() {
      this.id_super();
      return this.id_break[id_catch[10]];
   }

   public rrIv_1 id_break(Supplier<String> var1) {
      this.id_super();
      this.id_break[id_catch[6]] = var1;
      return this;
   }

   public rrte_3 id_finally() {
      this.id_super();
      return (rrte_3)this.id_break[id_catch[12]];
   }

   public String id_extends() {
      this.id_super();
      return this.id_break[id_catch[5]] + "";
   }

   private static void id_continue() {
      id_catch = new short[]{5, 6, 3, 1, 4, 3, 0, 5, 6, 0, 3, 3, 1, 2, 2, 4, 5};
   }

   private static void id_else() {
      id_case = new boolean[]{true, false};
   }

   private static void id_new() {
      id_byte = new float[]{80.0F, Float.MAX_VALUE, 0.0F};
   }

   public rrIv_1 id_package() {
      this.id_super();
      Boolean var5 = id_case[0];
      this.id_break[id_catch[8]] = var5;
      return this;
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[0]];
         Object[] var1 = this.id_break;
         var1[id_protected[1]] = id_byte[2];
         var1[id_protected[2]] = id_case[1];
      }
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{73, 33, 75, -36, 101, -66, 94, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_final() {
      this.id_super();
      return (String)this.id_break[id_catch[15]];
   }

   public float id_volatile() {
      this.id_super();
      return (Float)this.id_break[id_catch[16]];
   }

   public Supplier<String> id_native() {
      this.id_super();
      return (Supplier<String>)this.id_break[id_catch[9]];
   }
}
