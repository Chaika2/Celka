package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQP extends rrzY_2 implements PosixFileAttributes {
   public Object[] id_throws;
   private static short[] id_case;
   private static byte[] id_catch;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{30, -93, -64, -108, -107, -8, -33, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrQP(byte[] var1, Path var2, int var3, FileAttribute<?>[] var4, FileAttribute... var5) {
      super(var2, var3, var4, var5);
      this.id_finally();
      this.id_throws[2] = var1;
      UserPrincipal var11 = (UserPrincipal)((rrzf_3)this.id_throws[2]).id_break[13];
      this.id_throws[id_case[17]] = var11;
      GroupPrincipal var12 = (GroupPrincipal)((rrzf_3)this.id_throws[2]).id_break[14];
      this.id_throws[1] = var12;
   }

   public rrQP(rrzf_3 var1, rrQP var2, int var3) {
      super(var2, var3);
      this.id_finally();
      this.id_throws[2] = var1;
      UserPrincipal var9 = (UserPrincipal)((rrzf_3)this.id_throws[2]).id_break[13];
      this.id_throws[id_case[32]] = var9;
      GroupPrincipal var10 = (GroupPrincipal)((rrzf_3)this.id_throws[2]).id_break[14];
      this.id_throws[1] = var10;
      UserPrincipal var11 = (UserPrincipal)var2.id_throws[id_case[36]];
      this.id_throws[id_case[37]] = var11;
      GroupPrincipal var12 = (GroupPrincipal)var2.id_throws[1];
      this.id_throws[1] = var12;
   }

   public rrQP(rrzf_3 var1, byte[] var2, boolean var3, int var4) {
      super(var2, var3, var4);
      this.id_finally();
      this.id_throws[2] = var1;
      UserPrincipal var10 = (UserPrincipal)((rrzf_3)this.id_throws[2]).id_break[13];
      this.id_throws[id_case[3]] = var10;
      GroupPrincipal var11 = (GroupPrincipal)((rrzf_3)this.id_throws[2]).id_break[14];
      this.id_throws[1] = var11;
   }

   public rrQP(rrzf_3 var1, rrQP var2, int var3, int var4) {
      super(var2, var3);
      this.id_finally();
      this.id_throws[2] = var1;
      UserPrincipal var10 = (UserPrincipal)((rrzf_3)this.id_throws[2]).id_break[13];
      this.id_throws[id_case[24]] = var10;
      GroupPrincipal var11 = (GroupPrincipal)((rrzf_3)this.id_throws[2]).id_break[14];
      this.id_throws[1] = var11;
      Integer var12 = var4;
      this.id_class[6] = var12;
   }

   public rrQP(byte[] var1, int var2, boolean var3, int var4, FileAttribute<?>[] var5, FileAttribute... var6) {
      super(var2, var3, var4, var5, var6);
      this.id_finally();
      this.id_throws[2] = var1;
      UserPrincipal var12 = (UserPrincipal)((rrzf_3)this.id_throws[2]).id_break[13];
      this.id_throws[id_case[10]] = var12;
      GroupPrincipal var13 = (GroupPrincipal)((rrzf_3)this.id_throws[2]).id_break[14];
      this.id_throws[1] = var13;
   }

   public rrQP(rrzf_3 var1, rrzf_3 var2, rrzi_3 var3) throws IOException {
      super(var2, var3);
      this.id_finally();
      this.id_throws[2] = var1;
      UserPrincipal var9 = (UserPrincipal)((rrzf_3)this.id_throws[2]).id_break[13];
      this.id_throws[id_case[43]] = var9;
      GroupPrincipal var10 = (GroupPrincipal)((rrzf_3)this.id_throws[2]).id_break[14];
      this.id_throws[1] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public GroupPrincipal group() {
      this.id_finally();
      return (GroupPrincipal)this.id_throws[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6412944039157437110L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1176014434;
   }

   @Override
   public Set<PosixFilePermission> permissions() {
      this.id_finally();
      return this.id_class().orElse(Set.copyOf((Set)((rrzf_3)this.id_throws[2]).id_break[15]));
   }

   @Override
   public UserPrincipal owner() {
      this.id_finally();
      return (UserPrincipal)this.id_throws[id_case[47]];
   }

   private void id_finally() {
      if (this.id_throws == null) {
         this.id_throws = new Object[3];
         Object[] var1 = this.id_throws;
      }
   }

   private static void id_extends() {
      id_case = new short[]{
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         6,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         0,
         0,
         1,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         0,
         1,
         2,
         15
      };
   }

   private static void id_implements() {
      id_catch = new byte[]{3};
   }
}
