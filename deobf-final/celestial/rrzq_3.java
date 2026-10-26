package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzq_3 implements BasicFileAttributeView {
   private static short[] break_;
   private static boolean[] byte_;
   private static String[] protected_;
   public Object[] class_;
   private static byte[] throws_;

   private static void byte_() {
      byte_ = new boolean[]{false, false, true, false};
   }

   public rrzq_3(rrQs_1 var1, boolean var2) {
      this.protected_();
      this.class_[0] = var1;
      Boolean var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String name() {
      return this.class_[1] ? "zip" : protected_[1];
   }

   private static void class_() {
      break_ = new short[]{0, 1, 1, 0, 0, 0, 3, 2, 1, 14, 1, 1, 1, 1};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1123507463;
   }

   public Object class_(rrzT_2 param1, rrzt_3 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 13 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:427)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifyNewEnumSwitch(SwitchHelper.java:337)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:376)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual celestial/rrzT_2.ordinal ()I
      // 004: tableswitch 255 0 14 76 86 93 100 107 117 127 137 147 154 179 204 255 255 229
      // 050: aload 2
      // 051: invokeinterface celestial/rrzt_3.size ()J 1
      // 056: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059: areturn
      // 05a: aload 2
      // 05b: invokeinterface celestial/rrzt_3.creationTime ()Ljava/nio/file/attribute/FileTime; 1
      // 060: areturn
      // 061: aload 2
      // 062: invokeinterface celestial/rrzt_3.lastAccessTime ()Ljava/nio/file/attribute/FileTime; 1
      // 067: areturn
      // 068: aload 2
      // 069: invokeinterface celestial/rrzt_3.lastModifiedTime ()Ljava/nio/file/attribute/FileTime; 1
      // 06e: areturn
      // 06f: aload 2
      // 070: invokeinterface celestial/rrzt_3.isDirectory ()Z 1
      // 075: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 078: areturn
      // 079: aload 2
      // 07a: invokeinterface celestial/rrzt_3.isRegularFile ()Z 1
      // 07f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 082: areturn
      // 083: aload 2
      // 084: invokeinterface celestial/rrzt_3.isSymbolicLink ()Z 1
      // 089: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 08c: areturn
      // 08d: aload 2
      // 08e: invokeinterface celestial/rrzt_3.isOther ()Z 1
      // 093: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 096: areturn
      // 097: aload 2
      // 098: invokeinterface celestial/rrzt_3.fileKey ()Ljava/lang/Object; 1
      // 09d: areturn
      // 09e: aload 0
      // 09f: getfield celestial/rrzq_3.class_ [Ljava/lang/Object;
      // 0a2: bipush 1
      // 0a3: aaload
      // 0a4: checkcast java/lang/Boolean
      // 0a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0aa: ifeq 103
      // 0ad: aload 2
      // 0ae: invokeinterface celestial/rrzt_3.protected_ ()J 1
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: areturn
      // 0b7: aload 0
      // 0b8: getfield celestial/rrzq_3.class_ [Ljava/lang/Object;
      // 0bb: bipush 1
      // 0bc: aaload
      // 0bd: checkcast java/lang/Boolean
      // 0c0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c3: ifeq 103
      // 0c6: aload 2
      // 0c7: invokeinterface celestial/rrzt_3.case_ ()J 1
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: areturn
      // 0d0: aload 0
      // 0d1: getfield celestial/rrzq_3.class_ [Ljava/lang/Object;
      // 0d4: bipush 1
      // 0d5: aaload
      // 0d6: checkcast java/lang/Boolean
      // 0d9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0dc: ifeq 103
      // 0df: aload 2
      // 0e0: invokeinterface celestial/rrzt_3.break_ ()I 1
      // 0e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e8: areturn
      // 0e9: aload 0
      // 0ea: getfield celestial/rrzq_3.class_ [Ljava/lang/Object;
      // 0ed: bipush 1
      // 0ee: aaload
      // 0ef: checkcast java/lang/Boolean
      // 0f2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f5: ifeq 103
      // 0f8: aload 2
      // 0f9: invokeinterface celestial/rrzt_3.class_ ()Ljava/util/Optional; 1
      // 0fe: aconst_null
      // 0ff: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 102: areturn
      // 103: aconst_null
      // 104: areturn
   }

   public void class_(String var1, Object var2) throws IOException {
      try {
         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[break_[6]]) {
            this.setTimes((FileTime)var2, null, null);
         }

         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[break_[7]]) {
            this.setTimes(null, (FileTime)var2, null);
         }

         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[break_[8]]) {
            this.setTimes(null, null, (FileTime)var2);
         }

         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[break_[9]]) {
            this.setPermissions((Set<PosixFilePermission>)var2);
         }
      } catch (IllegalArgumentException var4) {
         throw new UnsupportedOperationException("'" + var1 + "' is unknown or read-only attribute");
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5448315826378005816L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, -80, -89, -68, -42, 98, 45, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public BasicFileAttributes readAttributes() throws IOException {
      return ((rrQs_1)this.class_[0]).class_();
   }

   private static void break_() {
      throws_ = new byte[]{2};
   }

   public Map<String, Object> break_(String var1) throws IOException {
      rrzt_3 var2 = (rrzt_3)this.readAttributes();
      LinkedHashMap var3 = new LinkedHashMap();
      if ("*".equals(var1)) {
         for (rrzT_2 var7 : rrzT_2.values()) {
            try {
               var3.put(var7.name(), this.class_(var7, var2));
            } catch (IllegalArgumentException var11) {
            }
         }
      } else {
         String[] var12 = var1.split(",");

         for (String var8 : var12) {
            try {
               var3.put(var8, this.class_(rrzT_2.valueOf(var8), var2));
            } catch (IllegalArgumentException var10) {
            }
         }
      }

      return var3;
   }

   private static void throws_() {
      protected_ = new String[]{new String("zip"), new String("basic"), new String("*"), new String(",")};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = false;
      }
   }

   public void setPermissions(Set<PosixFilePermission> var1) throws IOException {
      ((rrQs_1)this.class_[0]).class_(var1);
   }

   @Override
   public void setTimes(FileTime var1, FileTime var2, FileTime var3) throws IOException {
      ((rrQs_1)this.class_[0]).class_(var1, var2, var3);
   }
}
