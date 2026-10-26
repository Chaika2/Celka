package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIF extends Setting<KeyBind> {
   public Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   private static void id_int() {
      id_throws = new byte[]{5};
   }

   public rrIF(String var1, KeyBind var2) {
      super(var1, var2);
      this.id_package();
      Boolean var7 = id_protected[0];
      this.id_break[id_byte[0]] = var7;
      BiConsumer var8 = (var0, var1x) -> {
      };
      this.id_break[id_byte[1]] = var8;
      this.id_class[id_byte[2]] = var1;
      Supplier var10 = () -> var2;
      this.id_break[id_byte[3]] = var10;
      rrZO var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[4]]).id_finally();
      this.id_break[id_byte[5]] = var11;
      rrZO var12 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_byte[6]]).id_finally();
      this.id_break[id_byte[7]] = var12;
   }

   public rrIF(String var1, KeyBind var2, rrZO var3, rrZO var4) {
      this(var1, var2);
      this.id_break[id_byte[8]] = var3;
      this.id_break[id_byte[9]] = var4;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1797381854;
   }

   public rrIF id_class(boolean var1) {
      this.id_package();
      Boolean var6 = var1;
      this.id_break[id_byte[19]] = var6;
      return this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1083459702013190352L;
   }

   public void id_class(KeyBind var1, boolean var2, boolean var3) {
      this.id_package();
      if (var1 != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[11]] || (Boolean)this.id_break[id_byte[12]]) {
         Supplier var8 = () -> var1;
         this.id_break[id_byte[13]] = var8;
         if (var3) {
            ((BiConsumer)this.id_break[id_byte[14]]).accept(var1, var2);
         }
      }
   }

   public BiConsumer<KeyBind, Boolean> id_class() {
      this.id_package();
      return (BiConsumer<KeyBind, Boolean>)this.id_break[id_byte[24]];
   }

   public rrIF id_class(BiConsumer<KeyBind, Boolean> var1) {
      this.id_package();
      this.id_break[id_byte[18]] = var1;
      return this;
   }

   public rrIF id_break(Supplier<KeyBind> var1) {
      this.id_package();
      if (var1.get() == (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[15]] && !(Boolean)this.id_break[id_byte[16]]) {
         return this;
      } else {
         this.id_break[id_byte[17]] = var1;
         return this;
      }
   }

   public boolean id_break() {
      return (vm_3)QY.id_instanceof().id_class[id_byte[22]] == null && rrfC_2.id_break(this.id_finally().id_byte()) ? id_protected[1] : id_protected[2];
   }

   public KeyBind id_finally() {
      this.id_package();
      return (KeyBind)((Supplier)this.id_break[id_byte[10]]).get();
   }

   public rrZO id_extends() {
      this.id_package();
      return (rrZO)this.id_break[id_byte[20]];
   }

   private static void id_new() {
      id_protected = new boolean[]{true, true, false, true, false};
   }

   private void id_package() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
         var1[id_protected[3]] = id_protected[4];
      }
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 23, -38, 96, 86, -9, 36, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_final() {
      id_byte = new short[]{1, 4, 0, 0, 0, 2, 0, 3, 2, 3, 0, 0, 1, 0, 4, 0, 1, 0, 4, 1, 2, 3, 73, 1, 4};
   }

   public boolean id_volatile() {
      this.id_package();
      return (Boolean)this.id_break[id_byte[23]];
   }

   public rrZO id_native() {
      this.id_package();
      return (rrZO)this.id_break[id_byte[21]];
   }
}
