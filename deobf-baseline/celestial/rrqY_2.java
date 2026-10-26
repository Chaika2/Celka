package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqY_2 implements MinecraftAccessor {
   public Object[] fields0d81573182c03565b5bb298419afe0b7;
   public static Object[] staticFields0d81573182c03565b5bb298419afe0b7;
   private static short[] shorts0d81573182c03565b5bb298419afe0b7;
   private static boolean[] booleans0d81573182c03565b5bb298419afe0b7;
   private static String[] strings0d81573182c03565b5bb298419afe0b7;
   private static byte[] bytes0d81573182c03565b5bb298419afe0b7;

   public rrqU_2 id_byte(String var1) {
      return ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[20]])
         .stream()
         .filter(var1x -> ri_3.id_class(var1x.id_break()).equalsIgnoreCase(ri_3.id_class(ri_3.id_class(var1))))
         .findFirst()
         .orElse(null);
   }

   public Set<rrqU_2> id_byte() {
      return (Set<rrqU_2>)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[21]];
   }

   private rrqY_2() {
      this.id_finally();
      HashSet var7 = new HashSet();
      this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[1]] = var7;
      ArrayList var8 = new ArrayList();
      this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[2]] = var8;
      this.id_class(new rrqa_3());
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -562886032547598555L;
   }

   public void id_class(Consumer<rrqU_2> var1) {
      if (((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[16]]).isEmpty()) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[17]]).forEach(rrqe_3::id_class);
      } else {
         ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[18]]).forEach(var1);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1127930620;
   }

   public boolean id_class(String var1) {
      rrqU_2 var2 = this.id_byte(var1);
      if (var2 == null) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[7]]).forEach(var1x -> var1x.e_(var1));
         return booleans0d81573182c03565b5bb298419afe0b7[0];
      } else {
         boolean var3 = ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[8]]).remove(var2);
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[9]]).forEach(var2x -> var2x.id_class(var2, var3));
         if (var3) {
            ((yX_2)id_import.id_class[shorts0d81573182c03565b5bb298419afe0b7[10]]).id_throws();
         }

         return var3;
      }
   }

   public void id_class(rrqe_3 var1) {
      ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[19]]).add(var1);
   }

   public void id_class(rrqU_2 var1, String var2, boolean var3) {
      if (var1.id_break() == xu_3.id_class) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[3]])
            .forEach(var1x -> var1x.id_class(var2, new u_1(strings0d81573182c03565b5bb298419afe0b7[0])));
      } else {
         boolean var4 = ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[4]]).add(var1);
         if (var3) {
            ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[5]]).forEach(var2x -> var2x.id_break(var1, var4));
         }

         if (var4) {
            ((yX_2)id_import.id_class[shorts0d81573182c03565b5bb298419afe0b7[6]]).id_throws();
         }
      }
   }

   public List<rrqe_3> id_class() {
      return (List<rrqe_3>)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[22]];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 96, 110, -92, 35, 92, 45, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break() {
      if (((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[11]]).isEmpty()) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[12]]).forEach(rrqe_3::id_class);
      } else {
         ((Set)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[13]]).clear();
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[shorts0d81573182c03565b5bb298419afe0b7[14]]).forEach(rrqe_3::id_new);
         ((yX_2)id_import.id_class[shorts0d81573182c03565b5bb298419afe0b7[15]]).id_throws();
      }
   }

   private static void id_throws() {
      bytes0d81573182c03565b5bb298419afe0b7 = new byte[]{2, 2};
   }

   private void id_finally() {
      if (this.fields0d81573182c03565b5bb298419afe0b7 == null) {
         this.fields0d81573182c03565b5bb298419afe0b7 = new Object[2];
      }
   }

   private static void id_catch() {
      shorts0d81573182c03565b5bb298419afe0b7 = new short[]{1, 0, 1, 1, 0, 1, 8, 1, 0, 1, 8, 0, 1, 0, 1, 8, 0, 1, 0, 1, 0, 0, 1, 0};
   }

   private static void id_case() {
      booleans0d81573182c03565b5bb298419afe0b7 = new boolean[]{false, true, false, false, false, true};
   }

   private static void id_protected() {
      strings0d81573182c03565b5bb298419afe0b7 = new String[]{new String("Block not found"), new String("INSTANCE")};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrqY_2(), null};
      var0[1] = new rrqY_2[]{(rrqY_2)var0[0]};
      staticFields0d81573182c03565b5bb298419afe0b7 = var0;
   }
}
