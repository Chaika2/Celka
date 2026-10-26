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

public enum rrje_3 {
   private static String[] strings67a5399629443d9d93e54c2de6d74063;
   private static byte[] bytes67a5399629443d9d93e54c2de6d74063;
   public Object[] fields67a5399629443d9d93e54c2de6d74063;
   public static Object[] staticFields67a5399629443d9d93e54c2de6d74063;
   private static short[] shorts67a5399629443d9d93e54c2de6d74063;
   private static boolean[] booleans67a5399629443d9d93e54c2de6d74063;

   public Set<rrjD_2> id_byte() {
      return (Set<rrjD_2>)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[23]];
   }

   public rrjD_2 id_byte(String var1) {
      return ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[21]])
         .stream()
         .filter(var1x -> var1x.id_byte().equalsIgnoreCase(var1))
         .findFirst()
         .orElse(null);
   }

   private rrje_3() {
      this.id_catch();
      HashSet var7 = new HashSet();
      this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[1]] = var7;
      ArrayList var8 = new ArrayList();
      this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[2]] = var8;
      ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[3]]).add(new rrji_3());
   }

   static {
      ntfClinit();
   }

   public void id_class(rrja_3 var1) {
      ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[22]]).add(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 339644560;
   }

   public boolean id_class(rrjD_2 var1, boolean var2) {
      if (this.id_protected(var1.id_byte())) {
         this.id_break(var1.id_byte(), booleans67a5399629443d9d93e54c2de6d74063[0]);
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[4]]).forEach(var1x -> var1x.id_class(var1));
         var2 = booleans67a5399629443d9d93e54c2de6d74063[1];
      }

      boolean var3 = ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[5]]).add(var1);
      if (var2) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[6]]).forEach(var2x -> var2x.id_break(var1, var3));
      }

      return var3;
   }

   public boolean id_class(rja_3 var1) {
      if (var1 == null) {
         return booleans67a5399629443d9d93e54c2de6d74063[5];
      } else {
         for (rrjD_2 var3 : (Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[19]]) {
            eX_2 var4 = var3.id_break();
            if (var4 != null) {
               int var5 = (int)var4.id_class();
               int var6 = (int)var4.id_break();
               int var7 = (int)var4.id_byte();
               if (var5 == var1.b_() && var6 == var1.c_() && var7 == var1.d_()) {
                  return booleans67a5399629443d9d93e54c2de6d74063[6];
               }
            }
         }

         return booleans67a5399629443d9d93e54c2de6d74063[7];
      }
   }

   public void id_class(Consumer<rrjD_2> var1) {
      if (((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[14]]).isEmpty()) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[15]]).forEach(rrja_3::id_class);
      } else {
         ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[16]]).forEach(var1);
      }
   }

   public String id_class(String var1) {
      return this.id_class(var1, booleans67a5399629443d9d93e54c2de6d74063[8]);
   }

   public String id_class(String var1, boolean var2) {
      String var3 = var1;
      int var4 = booleans67a5399629443d9d93e54c2de6d74063[9];

      while (this.id_protected(var3) && !var2) {
         String var10000 = var1 + " %d";
         Object[] var10001 = new Object[booleans67a5399629443d9d93e54c2de6d74063[10]];
         var10001[booleans67a5399629443d9d93e54c2de6d74063[11]] = ++var4;
         var3 = String.format(var10000, var10001);
      }

      return var3;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5078802630424218111L;
   }

   public void id_class() {
      if (((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[10]]).isEmpty()) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[11]]).forEach(rrja_3::id_class);
      } else {
         ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[12]]).clear();
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[13]]).forEach(rrja_3::id_super);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -68, 4, 51, 74, 63, 36, -59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(String var1, boolean var2) {
      rrjD_2 var3 = this.id_byte(var1);
      if (var3 == null) {
         ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[7]]).forEach(var1x -> var1x.b_(var1));
      } else {
         if (var2) {
            ((List)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[8]])
               .forEach(var3x -> var3x.id_class(var3, this.id_protected(var1)));
         }

         ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[9]])
            .removeIf(var1x -> var1x.id_byte().equalsIgnoreCase(var1));
      }
   }

   public boolean id_break() {
      return ((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[20]]).isEmpty();
   }

   private static void id_throws() {
      shorts67a5399629443d9d93e54c2de6d74063 = new short[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0};
   }

   private void id_catch() {
      if (this.fields67a5399629443d9d93e54c2de6d74063 == null) {
         this.fields67a5399629443d9d93e54c2de6d74063 = new Object[bytes67a5399629443d9d93e54c2de6d74063[0]];
         Object[] var1 = this.fields67a5399629443d9d93e54c2de6d74063;
      }
   }

   private static void id_extends() {
      strings67a5399629443d9d93e54c2de6d74063 = new String[]{new String("INSTANCE")};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrje_3(), null};
      var0[1] = new rrje_3[]{(rrje_3)var0[0]};
      staticFields67a5399629443d9d93e54c2de6d74063 = var0;
   }

   private static void id_implements() {
      booleans67a5399629443d9d93e54c2de6d74063 = new boolean[]{
         false, false, false, true, false, false, true, false, false, true, true, false, true, false, false, false, true
      };
   }

   public boolean id_protected(String var1) {
      if (!rql_3.id_break(var1) && !((Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[17]]).isEmpty()) {
         for (rrjD_2 var3 : (Set)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[18]]) {
            if (var3.id_byte().equalsIgnoreCase(var1)) {
               return booleans67a5399629443d9d93e54c2de6d74063[3];
            }
         }

         return booleans67a5399629443d9d93e54c2de6d74063[4];
      } else {
         return booleans67a5399629443d9d93e54c2de6d74063[2];
      }
   }

   public List<rrja_3> id_protected() {
      return (List<rrja_3>)this.fields67a5399629443d9d93e54c2de6d74063[shorts67a5399629443d9d93e54c2de6d74063[24]];
   }

   private static void id_private() {
      bytes67a5399629443d9d93e54c2de6d74063 = new byte[]{2, 2};
   }
}
