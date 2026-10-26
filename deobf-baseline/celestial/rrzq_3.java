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
   private static short[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;
   public Object[] id_class;
   private static byte[] id_throws;

   private static void id_byte() {
      id_byte = new boolean[]{false, false, true, false};
   }

   public rrzq_3(rrQs_1 var1, boolean var2) {
      this.id_protected();
      this.id_class[id_break[0]] = var1;
      Boolean var8 = var2;
      this.id_class[id_break[1]] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String name() {
      return this.id_class[id_break[2]] ? id_protected[0] : id_protected[1];
   }

   private static void id_class() {
      id_break = new short[]{0, 1, 1, 0, 0, 0, 3, 2, 1, 14, 1, 1, 1, 1};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1123507463;
   }

   public Object id_class(rrzT_2 param1, rrzt_3 param2) {
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
      // 004: tableswitch 275 0 14 76 86 93 100 107 117 127 137 147 154 184 214 275 275 244
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
      // 09f: getfield celestial/rrzq_3.id_class [Ljava/lang/Object;
      // 0a2: getstatic celestial/rrzq_3.id_break [S
      // 0a5: ldc 10
      // 0a7: saload
      // 0a8: aaload
      // 0a9: checkcast java/lang/Boolean
      // 0ac: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0af: ifeq 117
      // 0b2: aload 2
      // 0b3: invokeinterface celestial/rrzt_3.id_protected ()J 1
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: areturn
      // 0bc: aload 0
      // 0bd: getfield celestial/rrzq_3.id_class [Ljava/lang/Object;
      // 0c0: getstatic celestial/rrzq_3.id_break [S
      // 0c3: ldc 11
      // 0c5: saload
      // 0c6: aaload
      // 0c7: checkcast java/lang/Boolean
      // 0ca: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0cd: ifeq 117
      // 0d0: aload 2
      // 0d1: invokeinterface celestial/rrzt_3.id_case ()J 1
      // 0d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d9: areturn
      // 0da: aload 0
      // 0db: getfield celestial/rrzq_3.id_class [Ljava/lang/Object;
      // 0de: getstatic celestial/rrzq_3.id_break [S
      // 0e1: ldc 12
      // 0e3: saload
      // 0e4: aaload
      // 0e5: checkcast java/lang/Boolean
      // 0e8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0eb: ifeq 117
      // 0ee: aload 2
      // 0ef: invokeinterface celestial/rrzt_3.id_break ()I 1
      // 0f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f7: areturn
      // 0f8: aload 0
      // 0f9: getfield celestial/rrzq_3.id_class [Ljava/lang/Object;
      // 0fc: getstatic celestial/rrzq_3.id_break [S
      // 0ff: ldc 13
      // 101: saload
      // 102: aaload
      // 103: checkcast java/lang/Boolean
      // 106: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 109: ifeq 117
      // 10c: aload 2
      // 10d: invokeinterface celestial/rrzt_3.id_class ()Ljava/util/Optional; 1
      // 112: aconst_null
      // 113: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 116: areturn
      // 117: aconst_null
      // 118: areturn
   }

   public void id_class(String var1, Object var2) throws IOException {
      try {
         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[6]]) {
            this.setTimes((FileTime)var2, null, null);
         }

         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[7]]) {
            this.setTimes(null, (FileTime)var2, null);
         }

         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[8]]) {
            this.setTimes(null, null, (FileTime)var2);
         }

         if (rrzT_2.valueOf(var1) == (rrzT_2)rrzT_2.staticFieldsf131934b317338e68bb375b05e34a601[id_break[9]]) {
            this.setPermissions((Set<PosixFilePermission>)var2);
         }
      } catch (IllegalArgumentException var4) {
         throw new UnsupportedOperationException("'" + var1 + "' is unknown or read-only attribute");
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5448315826378005816L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, -80, -89, -68, -42, 98, 45, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public BasicFileAttributes readAttributes() throws IOException {
      return ((rrQs_1)this.id_class[id_break[3]]).id_class();
   }

   private static void id_break() {
      id_throws = new byte[]{2};
   }

   public Map<String, Object> id_break(String var1) throws IOException {
      rrzt_3 var2 = (rrzt_3)this.readAttributes();
      LinkedHashMap var3 = new LinkedHashMap();
      if (id_protected[2].equals(var1)) {
         rrzT_2[] var4 = rrzT_2.values();
         int var5 = var4.length;

         for (int var6 = id_byte[0]; var6 < var5; var6++) {
            rrzT_2 var7 = var4[var6];

            try {
               var3.put(var7.name(), this.id_class(var7, var2));
            } catch (IllegalArgumentException var11) {
            }
         }
      } else {
         String[] var12 = var1.split(id_protected[3]);
         String[] var13 = var12;
         int var14 = var12.length;

         for (int var15 = id_byte[1]; var15 < var14; var15++) {
            String var8 = var13[var15];

            try {
               var3.put(var8, this.id_class(rrzT_2.valueOf(var8), var2));
            } catch (IllegalArgumentException var10) {
            }
         }
      }

      return var3;
   }

   private static void id_throws() {
      id_protected = new String[]{new String("zip"), new String("basic"), new String("*"), new String(",")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[2]] = id_byte[3];
      }
   }

   public void setPermissions(Set<PosixFilePermission> var1) throws IOException {
      ((rrQs_1)this.id_class[id_break[5]]).id_class(var1);
   }

   @Override
   public void setTimes(FileTime var1, FileTime var2, FileTime var3) throws IOException {
      ((rrQs_1)this.id_class[id_break[4]]).id_class(var1, var2, var3);
   }
}
