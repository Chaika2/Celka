/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLCapabilities
 */
package celestial;

import celestial.Hb_1;
import celestial.Hh_1;
import celestial.Ip_1;
import celestial.MT;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.VW;
import celestial.cT_2;
import celestial.cj_3;
import celestial.cm_3;
import celestial.cq_3;
import celestial.fJ_2;
import celestial.fY_2;
import celestial.jI_2;
import celestial.rAC;
import celestial.rAF;
import celestial.rAI;
import celestial.rAL;
import celestial.rAY;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rpN_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrJB;
import celestial.rrMm_1;
import celestial.rrQX;
import celestial.rrbg_3;
import celestial.rrbo_3;
import celestial.rrdZ;
import celestial.rrzE_2;
import celestial.rrzJ_2;
import celestial.rrzQ_2;
import celestial.vm_3;
import celestial.yX_2;
import celestial.yz_3;
import com.mojang.blaze3d.platform.GLX;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLCapabilities;

public class rrbb_3 {
    public static final String id_class = "OptiFine";
    public static final String id_break = "1.16.5";
    public static final String id_byte = "HD_U";
    public static final String id_protected = "G8";
    public static final String id_throws = "OptiFine_1.16.5_HD_U_G8";
    private static String id_super = null;
    private static boolean id_this = false;
    public static String id_case = null;
    public static String id_catch = null;
    public static String id_private = null;
    public static String[] id_implements = null;
    public static rrMm_1 id_finally = null;
    public static rrMm_1 id_extends = null;
    public static int id_native = -1;
    public static boolean id_volatile = false;
    public static boolean id_final = false;
    private static Qw_1 id_else = null;
    private static QY id_synchronized = QY.id_instanceof();
    private static boolean id_return = false;
    private static Thread id_public = null;
    private static int id_goto = 0;
    private static int id_while = 0;
    public static boolean id_package = false;
    public static boolean id_int = false;
    private static int id_try = 0;
    private static boolean id_instanceof = false;
    private static boolean id_throw = false;
    public static final Float id_new = Float.valueOf(0.1f);
    private static final Logger id_interface = LogManager.getLogger();
    public static final boolean id_continue = System.getProperty("log.detail", "false").equals("true");
    private static String id_char = null;
    private static int id_abstract = 0;
    private static int id_long = 0;
    private static fJ_2 id_float;
    private static long id_void;
    private static long id_static;
    private static boolean id_import;

    public static boolean id_boolean() {
        return rrbb_3.id_else.Ph != 2;
    }

    public static boolean id_char() {
        if (rrbb_3.id_else.rc != 0) {
            return rrbb_3.id_else.rc == 2;
        }
        if (rrbb_3.rs() && !rrdZ.sJ.id_catch()) {
            return rrdZ.sJ.id_implements();
        }
        if (id_try != 0) {
            return id_try == 2;
        }
        return rrbb_3.id_try();
    }

    private static void id_byte(String string, int n) {
        try {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            if (threadGroup == null) {
                return;
            }
            int n2 = (threadGroup.activeCount() + 10) * 2;
            Thread[] threadArray = new Thread[n2];
            threadGroup.enumerate(threadArray, false);
            for (int i = 0; i < threadArray.length; ++i) {
                Thread thread = threadArray[i];
                if (thread == null || !thread.getName().startsWith(string)) continue;
                thread.setPriority(n);
            }
        }
        catch (Throwable throwable) {
            rrbb_3.id_protected(throwable.getClass().getName() + ": " + throwable.getMessage());
        }
    }

    public static void id_byte(String string) {
    }

    public static boolean id_byte(rqO_2 rqO_22) {
        if (rqO_22 == null) {
            return false;
        }
        rAC rAC2 = rrbb_3.id_throws(rqO_22);
        return rAC2 != null;
    }

    public static String id_byte(int n) {
        switch (n) {
            case 0: {
                return "No error";
            }
            case 1280: {
                return "Invalid enum";
            }
            case 1281: {
                return "Invalid value";
            }
            case 1282: {
                return "Invalid operation";
            }
            case 1283: {
                return "Stack overflow";
            }
            case 1284: {
                return "Stack underflow";
            }
            case 1285: {
                return "Out of memory";
            }
            case 1286: {
                return "Invalid framebuffer operation";
            }
        }
        return "Unknown";
    }

    public static byte[] id_byte(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[1024];
        while (true) {
            int n;
            if ((n = inputStream.read(byArray)) < 0) {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(byArray, 0, n);
        }
    }

    public static void id_byte() {
        rrbb_3.id_protected();
        id_public = Thread.currentThread();
        rrbb_3.id_volatile();
        rrdZ.id_class(QY.id_instanceof());
    }

    public static void id_byte(String string, String string2) {
        rrJB rrJB2 = new rrJB((vm_3)rrbb_3.id_synchronized.id_class[73], string, string2);
        id_synchronized.id_break(rrJB2);
    }

    public static int id_int() {
        return rrbb_3.id_else.id_instanceof;
    }

    public static void id_long() {
        id_try = 0;
        rAL rAL2 = rrbb_3.x();
        if (rAL2 != null) {
            try {
                InputStream inputStream = rAL2.id_class(new rqO_2("optifine/color.properties")).id_break();
                if (inputStream == null) {
                    return;
                }
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                String string = rrzE_22.getProperty("clouds");
                if (string == null) {
                    return;
                }
                rrbb_3.id_byte("Texture pack clouds: " + string);
                string = string.toLowerCase();
                if (string.equals("fast")) {
                    id_try = 1;
                }
                if (string.equals("fancy")) {
                    id_try = 2;
                }
                if (string.equals("off")) {
                    id_try = 3;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static Ip_1 id_float() {
        return rrbb_3.id_synchronized.id_float().id_byte;
    }

    public static boolean id_double() {
        return rrbb_3.id_else.Px;
    }

    private rrbb_3() {
    }

    static {
        id_import = Boolean.getBoolean("frame.time");
    }

    public static boolean B() {
        return rrbb_3.id_else.Pz;
    }

    public static boolean C() {
        return rrbb_3.id_else.rw == 1;
    }

    public static boolean D() {
        return rrbb_3.id_else.rR;
    }

    public static boolean F() {
        if (!rrbb_3.v()) {
            return false;
        }
        return !rrbb_3.rs() || rrdZ.id_new();
    }

    public static boolean I() {
        return rrbb_3.id_else.PF;
    }

    public static fY_2 J() {
        return id_synchronized.A();
    }

    public static boolean S() {
        return rrbb_3.id_else.PQ;
    }

    public static boolean Z() {
        return rrbb_3.id_else.rH;
    }

    public static boolean V() {
        return rrbb_3.id_else.PA;
    }

    public static boolean id_this() {
        if (!rrbb_3.id_case()) {
            return false;
        }
        return rrbb_3.id_else.rM == 2;
    }

    public static boolean e() {
        return rrbb_3.id_else.rY;
    }

    public static boolean i() {
        return rrbb_3.id_else.rD;
    }

    public static boolean b() {
        return rrbb_3.id_else.Pm;
    }

    public static rAL x() {
        return id_synchronized.F();
    }

    public static boolean s() {
        return rrbb_3.id_else.PN;
    }

    public static boolean c() {
        return rrbb_3.id_else.rF != 3;
    }

    public static boolean n() {
        return rrbb_3.id_else.ry;
    }

    public static float h() {
        return rrbb_3.rs() && rrdZ.st >= 0.0f ? rrdZ.st : (float)rrbb_3.id_else.rz;
    }

    public static boolean f() {
        return rrbb_3.id_else.rI;
    }

    public static boolean l() {
        return rrbb_3.id_else.rw == 0;
    }

    public static rAC[] d() {
        rAt_1 rAt_12 = id_synchronized.id_char();
        Collection<rAp_1> collection = rAt_12.id_throws();
        ArrayList<rAC> arrayList = new ArrayList<rAC>();
        for (rAp_1 rAp_12 : collection) {
            rAC rAC2 = rAp_12.id_protected();
            if (rAC2 == rrbb_3.W()) continue;
            arrayList.add(rAC2);
        }
        rAC[] rACArray = arrayList.toArray(new rAC[arrayList.size()]);
        return rACArray;
    }

    public static boolean a() {
        return rrbb_3.id_else.ro != 3;
    }

    public static boolean id_interface() {
        return rrbb_3.id_else.rZ == 3;
    }

    public static String id_class(List list) {
        return rrbb_3.id_class(list, ", ");
    }

    public static int[] id_class(int[] nArray, int n) {
        return rrbb_3.id_class(nArray, new int[]{n});
    }

    public static void id_class(boolean bl) {
        id_this = bl;
    }

    public static int id_class(String string, int n) {
        try {
            if (string == null) {
                return n;
            }
            string = string.trim();
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public static String id_class(Object[] objectArray, String string) {
        if (objectArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(objectArray.length * 5);
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            if (i > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(String.valueOf(object));
        }
        return stringBuffer.toString();
    }

    public static String id_class(List list, String string) {
        if (list == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(list.size() * 5);
        for (int i = 0; i < list.size(); ++i) {
            Object e = list.get(i);
            if (i > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(String.valueOf(e));
        }
        return stringBuffer.toString();
    }

    public static String id_class(Object[] objectArray) {
        return rrbb_3.id_class(objectArray, ", ");
    }

    public static int[] id_class(Integer[] integerArray) {
        if (integerArray == null) {
            return null;
        }
        if (integerArray.length == 0) {
            return new int[0];
        }
        int[] nArray = new int[integerArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = integerArray[i];
        }
        return nArray;
    }

    public static String id_class() {
        return id_throws;
    }

    public static String id_class(boolean[] blArray, String string) {
        if (blArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(blArray.length * 5);
        for (int i = 0; i < blArray.length; ++i) {
            boolean bl = blArray[i];
            if (i > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(String.valueOf(bl));
        }
        return stringBuffer.toString();
    }

    public static Boolean id_class(String string, Boolean bl) {
        try {
            if (string == null) {
                return bl;
            }
            if ((string = string.trim().toLowerCase()).equals("true")) {
                return Boolean.TRUE;
            }
            return string.equals("false") ? Boolean.FALSE : bl;
        }
        catch (NumberFormatException numberFormatException) {
            return bl;
        }
    }

    public static String[] id_class(String string, String string2) {
        String[] stringArray;
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        while (stringTokenizer.hasMoreTokens()) {
            stringArray = stringTokenizer.nextToken();
            arrayList.add(stringArray);
        }
        stringArray = arrayList.toArray(new String[arrayList.size()]);
        return stringArray;
    }

    public static void id_class(Ml_1 ml_1) {
        int n = rrbb_3.rN();
        int n2 = ((yX_2)rrbb_3.id_synchronized.id_class[8]).id_package();
        int n3 = ((yX_2)rrbb_3.id_synchronized.id_class[8]).id_int();
        int n4 = ((yX_2)rrbb_3.id_synchronized.id_class[8]).id_new();
        String string = rrbb_3.rk() + ", C: " + n2 + ", E: " + n3 + "+" + n4 + ", U: " + n;
        ((cm_3)rrbb_3.id_synchronized.id_class[15]).id_break(ml_1, string, 2.0f, 2.0f, -2039584);
    }

    public static float id_class(String string, float f) {
        try {
            if (string == null) {
                return f;
            }
            string = string.trim();
            return Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return f;
        }
    }

    public static boolean id_class(String string, boolean bl) {
        try {
            if (string == null) {
                return bl;
            }
            string = string.trim();
            return Boolean.parseBoolean(string);
        }
        catch (NumberFormatException numberFormatException) {
            return bl;
        }
    }

    public static void id_class(long l) {
        try {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            rrbb_3.id_break("", interruptedException);
        }
    }

    public static void id_class(Object object, String string) throws NullPointerException {
        if (object == null) {
            throw new NullPointerException(string);
        }
    }

    public static boolean id_class(rAC rAC2, rqO_2 rqO_22) {
        return rAC2 != null && rqO_22 != null ? rAC2.id_break(rAI.CLIENT_RESOURCES, rqO_22) : false;
    }

    public static InputStream id_class(rAL rAL2, rqO_2 rqO_22) throws IOException {
        rAF rAF2 = rAL2.id_class(rqO_22);
        return rAF2 == null ? null : rAF2.id_break();
    }

    public static void id_class(File file, String string) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] byArray = string.getBytes("ASCII");
        fileOutputStream.write(byArray);
        fileOutputStream.close();
    }

    public static rrMm_1 id_class(String string, rrMm_1 rrMm_12) {
        try {
            if (string == null) {
                return rrMm_12;
            }
            Pattern pattern = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) {
                return rrMm_12;
            }
            int n = Integer.parseInt(matcher.group(1));
            int n2 = Integer.parseInt(matcher.group(2));
            int n3 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4)) : 0;
            String string2 = matcher.group(5);
            return new rrMm_1(n, n2, n3, string2);
        }
        catch (Exception exception) {
            rrbb_3.id_break("", exception);
            return rrMm_12;
        }
    }

    public static void id_class(fJ_2 fJ_22) {
        id_float = fJ_22;
    }

    public static String id_class(float[] fArray, String string) {
        if (fArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(fArray.length * 5);
        for (int i = 0; i < fArray.length; ++i) {
            float f = fArray[i];
            if (i > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(String.valueOf(f));
        }
        return stringBuffer.toString();
    }

    public static String id_class(float[] fArray) {
        return rrbb_3.id_class(fArray, ", ");
    }

    public static String id_class(int[] nArray, String string) {
        if (nArray == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(nArray.length * 5);
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            if (i > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(String.valueOf(n));
        }
        return stringBuffer.toString();
    }

    public static String id_class(int[] nArray) {
        return rrbb_3.id_class(nArray, ", ");
    }

    public static boolean id_class(Boolean bl) {
        return bl != null && bl != false;
    }

    public static int[] id_class(int[] nArray, int[] nArray2) {
        if (nArray != null && nArray2 != null) {
            int n = nArray.length;
            int n2 = n + nArray2.length;
            int[] nArray3 = new int[n2];
            System.arraycopy(nArray, 0, nArray3, 0, n);
            for (int i = 0; i < nArray2.length; ++i) {
                nArray3[i + n] = nArray2[i];
            }
            return nArray3;
        }
        throw new NullPointerException("The given array is NULL");
    }

    public static InputStream id_class(rqO_2 rqO_22) throws IOException {
        return rrbb_3.id_class(id_synchronized.F(), rqO_22);
    }

    public static Object[] id_class(Object[] objectArray, Object object, int n) {
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(objectArray));
        arrayList.add(n, object);
        Object[] objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), arrayList.size());
        return arrayList.toArray(objectArray2);
    }

    public static String[] id_class(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return rrbb_3.id_class(fileInputStream);
    }

    public static String[] id_class(InputStream inputStream) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "ASCII");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            arrayList.add(string);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static Object[] id_class(Object[] objectArray, Object object) {
        if (objectArray == null) {
            throw new NullPointerException("The given array is NULL");
        }
        int n = objectArray.length;
        int n2 = n + 1;
        Object[] objectArray2 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
        System.arraycopy(objectArray, 0, objectArray2, 0, n);
        objectArray2[n] = object;
        return objectArray2;
    }

    public static boolean id_class(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        return object == null ? false : object.equals(object2);
    }

    public static Object[] id_class(Object[] objectArray, Object[] objectArray2) {
        if (objectArray == null) {
            throw new NullPointerException("The given array is NULL");
        }
        if (objectArray2.length == 0) {
            return objectArray;
        }
        int n = objectArray.length;
        int n2 = n + objectArray2.length;
        Object[] objectArray3 = (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
        System.arraycopy(objectArray, 0, objectArray3, 0, n);
        System.arraycopy(objectArray2, 0, objectArray3, n, objectArray2.length);
        return objectArray3;
    }

    public static int id_class(int n, int n2, int n3) {
        if (n < n2) {
            return n2;
        }
        return n > n3 ? n3 : n;
    }

    public static int id_class(rfH_2 rfH_22, int n) {
        int n2 = rrbb_3.id_class(n + 37);
        n2 = rrbb_3.id_class(n2 + rfH_22.b_());
        n2 = rrbb_3.id_class(n2 + rfH_22.d_());
        return rrbb_3.id_class(n2 + rfH_22.c_());
    }

    public static boolean id_class(Object object, Object[] objectArray) {
        if (objectArray == null) {
            return false;
        }
        for (int i = 0; i < objectArray.length; ++i) {
            Object object2 = objectArray[i];
            if (!rrbb_3.id_class(object, object2)) continue;
            return true;
        }
        return false;
    }

    public static boolean id_class(int n, int[] nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            return true;
        }
        return false;
    }

    public static int id_class(int n) {
        n = n ^ 0x3D ^ n >> 16;
        n += n << 3;
        n ^= n >> 4;
        return (n *= 668265261) ^ n >> 15;
    }

    public static void id_class(Qw_1 qw_1) {
        if (id_else == null) {
            id_else = qw_1;
            rrbb_3.rb();
            id_goto = rrbb_3.id_else.rQ;
        }
    }

    public static String id_class(InputStream inputStream, String string) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String string2;
            if ((string2 = bufferedReader.readLine()) == null) {
                inputStream.close();
                return stringBuffer.toString();
            }
            stringBuffer.append(string2);
            stringBuffer.append("\n");
        }
    }

    public static float id_class(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > 1.0f ? 1.0f : f;
    }

    public static Object[] id_class(Collection collection, Class clazz) {
        if (collection == null) {
            return null;
        }
        if (clazz == null) {
            return null;
        }
        if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + clazz);
        }
        Object[] objectArray = (Object[])Array.newInstance(clazz, collection.size());
        return collection.toArray(objectArray);
    }

    public static boolean id_class(URI uRI) {
        rqR_2.id_class((Exception)null);
        rqR_2.id_implements().id_class(uRI);
        Exception exception = rqR_2.id_native();
        return exception == null;
    }

    public static InputStream id_class(String string) {
        return rrbb_3.class.getResourceAsStream(string);
    }

    public static void id_class(String string, Throwable throwable) {
        id_interface.warn("[OptiFine] " + string, throwable);
    }

    public static long id_class(long l, long l2, long l3) {
        if (l < l2) {
            return l2;
        }
        return l > l3 ? l3 : l;
    }

    public static double id_class(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    public static float id_class(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static boolean rd() {
        return rrbb_3.id_else.rK;
    }

    public static boolean m() {
        return rrbb_3.id_else.rl;
    }

    public static int o() {
        return rrbb_3.id_else.id_abstract;
    }

    public static boolean p() {
        return rrbb_3.y() > 1;
    }

    public static String k() {
        if (id_synchronized.F() == null) {
            return "";
        }
        rAC[] rACArray = rrbb_3.d();
        if (rACArray.length <= 0) {
            return rrbb_3.W().id_class();
        }
        String[] stringArray = new String[rACArray.length];
        for (int i = 0; i < rACArray.length; ++i) {
            stringArray[i] = rACArray[i].id_class();
        }
        return rrbb_3.id_class(stringArray);
    }

    public static boolean id_default() {
        return rrbb_3.id_else.PO != 2;
    }

    public static void rb() {
        id_while = Runtime.getRuntime().availableProcessors();
    }

    public static boolean t() {
        return rrbb_3.rE().rQ > 0;
    }

    public static boolean g() {
        return rrbb_3.id_else.rf;
    }

    public static boolean v() {
        return rrbb_3.id_else.rp;
    }

    public static boolean j() {
        return rrbb_3.id_else.PL;
    }

    public static int q() {
        return id_goto;
    }

    public static boolean U() {
        return rrbb_3.id_else.rV;
    }

    public static boolean id_short() {
        if (rrbb_3.id_else.rv == 0) {
            return rrbb_3.id_try();
        }
        return rrbb_3.id_else.rv == 2;
    }

    public static yX_2 z() {
        return (yX_2)rrbb_3.id_synchronized.id_class[8];
    }

    public static void rf() {
        long l = System.currentTimeMillis();
        long l2 = l - id_void;
        id_void = l;
        l2 = rrbb_3.id_class(l2, 1L, 1000L);
        id_static = (id_static + l2) / 2L;
        id_static = rrbb_3.id_class(id_static, 1L, 1000L);
        if ((String)rrbb_3.id_synchronized.id_class[79] != id_char) {
            id_char = (String)rrbb_3.id_synchronized.id_class[79];
            rrbb_3.rc();
            rrbb_3.rK();
        }
    }

    public static boolean id_void() {
        if (rrbb_3.id_else.rm == 0) {
            return rrbb_3.id_try();
        }
        return rrbb_3.id_else.rm != 1;
    }

    public static boolean w() {
        if (rrbb_3.y() > 1) {
            return true;
        }
        return rrbb_3.q() > 0;
    }

    public static boolean rv() {
        return false;
    }

    public static boolean u() {
        return rrbb_3.id_else.rF == 2;
    }

    public static boolean r() {
        return rrbb_3.id_else.Pk;
    }

    public static boolean rn() {
        if (!rrbb_3.rL()) {
            return false;
        }
        return rrbb_3.rs() ? rrdZ.id_finally() : true;
    }

    public static int y() {
        return rrbb_3.id_else.rN;
    }

    public static Hh_1 N() {
        return (Hh_1)rrbb_3.id_synchronized.id_class[16];
    }

    public static boolean rh() {
        return rrbb_3.id_else.rd;
    }

    public static void id_break(String string) {
        if (id_continue) {
            id_interface.info("[OptiFine] " + string);
        }
    }

    public static boolean id_break(double d, double d2, double d3) {
        return d >= d2 && d <= d3;
    }

    public static boolean id_break(Object object, Object[] objectArray) {
        if (objectArray == null) {
            return false;
        }
        for (int i = 0; i < objectArray.length; ++i) {
            Object object2 = objectArray[i];
            if (object != object2) continue;
            return true;
        }
        return false;
    }

    public static boolean id_break(int n, int n2, int n3) {
        return n >= n2 && n <= n3;
    }

    public static Object[] id_break(Object[] objectArray, Object object) {
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(objectArray));
        arrayList.remove(object);
        return rrbb_3.id_class(arrayList, objectArray.getClass().getComponentType());
    }

    public static String id_break(InputStream inputStream) throws IOException {
        return rrbb_3.id_class(inputStream, "ASCII");
    }

    public static int id_break(String string, int n) {
        try {
            if (string == null) {
                return n;
            }
            if ((string = string.trim()).startsWith("0x")) {
                string = string.substring(2);
            }
            return Integer.parseInt(string, 16);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public static String id_break(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return rrbb_3.id_class(fileInputStream, "ASCII");
    }

    public static boolean id_break(rAL rAL2, rqO_2 rqO_22) {
        try {
            rAF rAF2 = rAL2.id_class(rqO_22);
            return rAF2 != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static int id_break(String string, String string2) {
        int n;
        String[] stringArray;
        String string3;
        String[] stringArray2 = rrbb_3.id_implements(string);
        String string4 = stringArray2[0];
        if (!string4.equals(string3 = (stringArray = rrbb_3.id_implements(string2))[0])) {
            return string4.compareTo(string3);
        }
        int n2 = rrbb_3.id_class(stringArray2[1], -1);
        if (n2 != (n = rrbb_3.id_class(stringArray[1], -1))) {
            return n2 - n;
        }
        String string5 = stringArray2[2];
        String string6 = stringArray[2];
        if (!string5.equals(string6)) {
            if (string5.isEmpty()) {
                return 1;
            }
            if (string6.isEmpty()) {
                return -1;
            }
        }
        return string5.compareTo(string6);
    }

    public static boolean id_break(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static void id_break(String string, Throwable throwable) {
        id_interface.error("[OptiFine] " + string, throwable);
    }

    public static rAF id_break(rqO_2 rqO_22) throws IOException {
        return id_synchronized.F().id_class(rqO_22);
    }

    public static IntBuffer id_break(int n) {
        return Hb_1.id_class(n << 2).asIntBuffer();
    }

    public static String id_break() {
        StringBuffer stringBuffer = new StringBuffer(32);
        if (rrbb_3.rL()) {
            stringBuffer.append("DL: ");
            stringBuffer.append(String.valueOf(rrbg_3.id_break()));
            stringBuffer.append(", ");
        }
        stringBuffer.append(id_throws);
        String string = rrdZ.y();
        if (string != null) {
            stringBuffer.append(", ");
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public static void id_throws(String string) {
        id_interface.error("[OptiFine] " + string);
    }

    public static rAC id_throws(rqO_2 rqO_22) {
        rAt_1 rAt_12 = id_synchronized.id_char();
        Collection<rAp_1> collection = rAt_12.id_throws();
        List list = (List)collection;
        for (int i = list.size() - 1; i >= 0; --i) {
            rAp_1 rAp_12 = (rAp_1)list.get(i);
            rAC rAC2 = rAp_12.id_protected();
            if (!rAC2.id_break(rAI.CLIENT_RESOURCES, rqO_22)) continue;
            return rAC2;
        }
        return null;
    }

    public static String id_throws() {
        if (id_super == null) {
            try {
                InputStream inputStream = rrbb_3.id_class("/buildof.txt");
                if (inputStream == null) {
                    return null;
                }
                id_super = rrbb_3.id_class(inputStream)[0];
            }
            catch (Exception exception) {
                rrbb_3.id_protected(exception.getClass().getName() + ": " + exception.getMessage());
                id_super = "";
            }
        }
        return id_super;
    }

    public static boolean L() {
        if (!rrbb_3.v()) {
            return false;
        }
        return !rrbb_3.rs() || rrdZ.id_continue();
    }

    public static boolean rt() {
        if (id_synchronized.id_this() == null) {
            return false;
        }
        return id_synchronized.id_switch();
    }

    public static boolean M() {
        return rrbb_3.id_else.PZ;
    }

    public static rAY W() {
        return id_synchronized.Z().id_class();
    }

    public static boolean H() {
        return rrbb_3.id_else.rw == 2;
    }

    public static boolean R() {
        return rrbb_3.id_else.rj;
    }

    public static boolean P() {
        return rrbb_3.id_else.PW;
    }

    public static rrMm_1 id_finally() {
        if (id_finally == null) {
            String string = GL11.glGetString((int)7938);
            id_finally = rrbb_3.id_class(string, (rrMm_1)null);
            if (id_finally == null) {
                id_finally = rrbb_3.rY();
            }
            if (id_finally == null) {
                id_finally = new rrMm_1(1, 0);
            }
        }
        return id_finally;
    }

    public static void id_catch(String string) {
        int n = MT.id_switch();
        if (n != 0 && rrbo_3.id_class(n)) {
            String string2 = rrbb_3.id_byte(n);
            String string3 = String.format("OpenGL error: %s (%s), at: %s", n, string2, string);
            rrbb_3.id_throws(string3);
            if (rrbb_3.rT() && rrzQ_2.id_class("ShowGlError", 10000L)) {
                String string4 = jI_2.id_class("of.message.openglError", n, string2);
                ((cq_3)rrbb_3.id_synchronized.id_class[19]).id_throws().id_class(new rgN_2(string4));
            }
        }
    }

    public static boolean id_catch() {
        return id_final;
    }

    public static boolean G() {
        return rrbb_3.id_else.Pu;
    }

    public static boolean O() {
        return rrbb_3.id_else.Pv;
    }

    public static rrMm_1 id_extends() {
        String string;
        if (id_extends == null && (id_extends = rrbb_3.id_class(string = GL11.glGetString((int)35724), (rrMm_1)null)) == null) {
            id_extends = new rrMm_1(1, 10);
        }
        return id_extends;
    }

    public static int id_goto() {
        return rrbb_3.id_else.rT;
    }

    public static boolean K() {
        return rrbb_3.id_else.rg;
    }

    public static boolean id_case() {
        return id_volatile;
    }

    public static void id_case(String string) {
    }

    public static boolean id_const() {
        return rrbb_3.id_else.PO == 1;
    }

    public static boolean id_continue() {
        float f = rrbb_3.id_super();
        return f > id_new.floatValue() + 1.0E-5f;
    }

    public static boolean id_else() {
        return rrbb_3.id_else.rM == 1;
    }

    public static boolean id_for() {
        return rrbb_3.id_else.PX;
    }

    public static String id_implements() {
        rrMm_1 rrMm_12 = rrbb_3.id_finally();
        return rrMm_12.id_class() + "." + rrMm_12.id_break() + "." + rrMm_12.id_byte();
    }

    private static String[] id_implements(String string) {
        if (string != null && string.length() > 0) {
            Pattern pattern = Pattern.compile("([A-Z])([0-9]+)(.*)");
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) {
                return new String[]{"", "", ""};
            }
            String string2 = rrbb_3.id_private(matcher.group(1));
            String string3 = rrbb_3.id_private(matcher.group(2));
            String string4 = rrbb_3.id_private(matcher.group(3));
            return new String[]{string2, string3, string4};
        }
        return new String[]{"", "", ""};
    }

    public static boolean id_import() {
        if (rrbb_3.id_else.rm == 0) {
            return !rrbb_3.id_try();
        }
        return rrbb_3.id_else.rm == 4;
    }

    public static boolean id_instanceof() {
        return rrbb_3.id_else.id_case == VW.FABULOUS;
    }

    public static int id_new() {
        switch (rrbb_3.id_else.rh) {
            case 0: {
                return 9986;
            }
            case 1: {
                return 9986;
            }
            case 2: {
                if (rrbb_3.w()) {
                    return 9985;
                }
                return 9986;
            }
            case 3: {
                if (rrbb_3.w()) {
                    return 9987;
                }
                return 9986;
            }
        }
        return 9986;
    }

    public static boolean id_package() {
        return rrbb_3.id_else.id_instanceof > 0;
    }

    public static boolean id_return() {
        return rrbb_3.id_else.rM != 3;
    }

    public static float id_super() {
        return id_new.floatValue();
    }

    public static boolean id_switch() {
        return rrbb_3.id_else.Pd;
    }

    public static boolean id_throw() {
        if (rrbb_3.id_else.rZ == 0) {
            return rrbb_3.id_try();
        }
        return rrbb_3.id_else.rZ == 2;
    }

    public static boolean id_try() {
        return rrbb_3.id_else.id_case != VW.FAST;
    }

    public static boolean id_while() {
        return rrbb_3.id_else.rt;
    }

    public static boolean rs() {
        return rrdZ.sr;
    }

    public static boolean id_static() {
        return rrbb_3.id_else.rm == 4;
    }

    public static float id_public() {
        return rrbb_3.id_else.rO;
    }

    public static boolean id_protected(rqO_2 rqO_22) {
        return rrbb_3.id_throws(rqO_22) == rrbb_3.W();
    }

    private static ByteBuffer id_protected(InputStream inputStream) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        int[] nArray = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * nArray.length);
        for (int n : nArray) {
            byteBuffer.putInt(n << 8 | n >> 24 & 0xFF);
        }
        ((Buffer)byteBuffer).flip();
        return byteBuffer;
    }

    public static void id_protected() {
        if (!id_return && QY.id_instanceof().id_else() != null) {
            id_return = true;
            rrbb_3.rR();
        }
    }

    public static void id_protected(String string) {
        id_interface.warn("[OptiFine] " + string);
    }

    public static boolean id_protected(int n) {
        return GLFW.glfwGetKey((long)id_synchronized.id_else().id_implements(), (int)n) == 1;
    }

    public static String id_private(String string) {
        return string == null ? "" : string;
    }

    public static int id_private() {
        if (id_native < 0) {
            String[] stringArray = rrbb_3.id_class(id_break, ".");
            int n = 0;
            if (stringArray.length > 0) {
                n += 10000 * rrbb_3.id_class(stringArray[0], 0);
            }
            if (stringArray.length > 1) {
                n += 100 * rrbb_3.id_class(stringArray[1], 0);
            }
            if (stringArray.length > 2) {
                n += 1 * rrbb_3.id_class(stringArray[2], 0);
            }
            id_native = n;
        }
        return id_native;
    }

    public static boolean id_abstract() {
        if (rrbb_3.id_else.rc != 0) {
            return rrbb_3.id_else.rc == 3;
        }
        if (rrbb_3.rs() && !rrdZ.sJ.id_catch()) {
            return rrdZ.sJ.id_finally();
        }
        if (id_try != 0) {
            return id_try == 3;
        }
        return false;
    }

    public static boolean id_final() {
        return Thread.currentThread() == id_public;
    }

    public static boolean id_transient() {
        return rrbb_3.id_else.Ph == 1;
    }

    public static void id_volatile() {
        rrbb_3.rb();
        int n = 8;
        if (rrbb_3.rM()) {
            if (rrbb_3.rO()) {
                id_public.setPriority(10);
                rrbb_3.id_byte("Server thread", 1);
            } else {
                id_public.setPriority(5);
                rrbb_3.id_byte("Server thread", 5);
            }
        } else {
            id_public.setPriority(10);
            rrbb_3.id_byte("Server thread", 5);
        }
    }

    public static boolean id_synchronized() {
        return rrbb_3.id_else.rM == 3 || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_();
    }

    public static String[] id_native() {
        if (id_implements == null) {
            id_implements = rrbb_3.ro();
        }
        return id_implements;
    }

    public static boolean id_strictfp() {
        return rrbb_3.id_else.PJ;
    }

    public static boolean E() {
        return rrbb_3.id_else.Pc;
    }

    public static boolean rp() {
        return GLX.useVbo();
    }

    public static boolean rl() {
        return rrbb_3.id_else.Ps;
    }

    public static boolean A() {
        if (rrbb_3.rs() && !rrdZ.id_super()) {
            return false;
        }
        if (rrbb_3.id_else.rq == 0) {
            return rrbb_3.id_try();
        }
        return rrbb_3.id_else.rq == 2;
    }

    public static boolean rw() {
        cj_3 cj_32;
        if ((cT_2)rrbb_3.id_synchronized.id_class[75] == null) {
            return false;
        }
        return !((cT_2)rrbb_3.id_synchronized.id_class[75] instanceof cj_3) || !(cj_32 = (cj_3)((cT_2)rrbb_3.id_synchronized.id_class[75])).id_throws();
    }

    public static long rg() {
        return 1000L / rrbb_3.rj();
    }

    public static int ru() {
        String string = System.getenv("ProgramFiles(X86)");
        return string != null ? 64 : 32;
    }

    public static boolean T() {
        return rrbb_3.q() > 0;
    }

    public static QY X() {
        return id_synchronized;
    }

    private static String[] ro() {
        Object object;
        try {
            int n;
            object = rrbb_3.id_finally();
            if (((rrMm_1)object).id_class() >= 3 && (n = GL11.glGetInteger((int)33309)) > 0) {
                String[] stringArray = new String[n];
                for (int i = 0; i < n; ++i) {
                    stringArray[i] = GL30.glGetStringi((int)7939, (int)i);
                }
                return stringArray;
            }
        }
        catch (Exception exception) {
            rrbb_3.id_break("", exception);
        }
        try {
            object = GL11.glGetString((int)7939);
            return ((String)object).split(" ");
        }
        catch (Exception exception) {
            rrbb_3.id_break("", exception);
            return new String[0];
        }
    }

    public static yX_2 Q() {
        return (yX_2)rrbb_3.id_synchronized.id_class[8];
    }

    public static boolean rr() {
        return rrbb_3.id_else.rU;
    }

    public static int rm() {
        String[] stringArray = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return 64;
        }
        return 32;
    }

    public static boolean rq() {
        return rrbb_3.id_else.rJ;
    }

    public static void rc() {
        int n;
        rpN_2 rpN_22 = id_synchronized.k();
        long[] lArray = rpN_22.id_byte();
        int n2 = rpN_22.id_break();
        if (n2 != (n = rpN_22.id_class())) {
            long l;
            int n3 = (Integer)QY.id_break[9];
            if (n3 <= 0) {
                n3 = 1;
            }
            long l2 = l = (long)(1.0 / (double)n3 * 1.0E9);
            long l3 = 0L;
            int n4 = rfU_2.id_break(n2 - 1, lArray.length);
            while (n4 != n && (double)l3 < 1.0E9) {
                long l4 = lArray[n4];
                if (l4 > l2) {
                    l2 = l4;
                }
                l3 += l4;
                n4 = rfU_2.id_break(n4 - 1, lArray.length);
            }
            double d = (double)l2 / 1.0E9;
            id_abstract = (int)(1.0 / d);
        }
    }

    public static boolean ry() {
        if (rrbb_3.w()) {
            return false;
        }
        return rrbb_3.id_else.rk && MT.id_protected;
    }

    public static boolean rO() {
        return rrbb_3.id_else.rx;
    }

    public static int rQ() {
        return id_abstract;
    }

    public static boolean rJ() {
        return rrbb_3.id_else.PP;
    }

    public static boolean rA() {
        return rrbb_3.id_else.PB == 1;
    }

    public static boolean rM() {
        return rrbb_3.rG() <= 1;
    }

    public static boolean rC() {
        return rrbb_3.id_else.PS;
    }

    public static boolean rB() {
        return rrbb_3.id_else.ra;
    }

    public static int rG() {
        return id_while;
    }

    public static boolean rL() {
        return rrbb_3.id_else.PB != 3;
    }

    public static String rk() {
        int n = rrbb_3.rz();
        int n2 = rrbb_3.rQ();
        if (id_import) {
            String string = String.format("%.1f", 1000.0 / (double)rrbb_3.id_class(n, 1, Integer.MAX_VALUE));
            String string2 = String.format("%.1f", 1000.0 / (double)rrbb_3.id_class(n2, 1, Integer.MAX_VALUE));
            return string + "/" + string2 + " ms";
        }
        return n + "/" + n2 + " fps";
    }

    public static boolean rX() {
        return rrbb_3.id_else.Pr;
    }

    public static int rH() {
        return rrbb_3.id_else.PG;
    }

    public static boolean rZ() {
        return id_this;
    }

    public static long rj() {
        return id_static;
    }

    public static float rV() {
        return (float)rrbb_3.rj() / 1000.0f;
    }

    public static Qw_1 rE() {
        return id_else;
    }

    public static boolean rP() {
        return rrbb_3.id_else.ro == 2;
    }

    public static int rz() {
        return (Integer)QY.id_break[9];
    }

    public static boolean rW() {
        return id_import;
    }

    public static boolean rI() {
        if (!rrbb_3.rs()) {
            return false;
        }
        return !rrdZ.e();
    }

    private static void rR() {
        rrbb_3.id_case("");
        rrbb_3.id_case(rrbb_3.id_class());
        rrbb_3.id_case("Build: " + rrbb_3.id_throws());
        rrbb_3.id_case("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        rrbb_3.id_case("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        rrbb_3.id_case("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        rrbb_3.id_case("LWJGL: " + GLFW.glfwGetVersionString());
        id_case = GL11.glGetString((int)7938);
        id_catch = GL11.glGetString((int)7937);
        id_private = GL11.glGetString((int)7936);
        rrbb_3.id_case("OpenGL: " + id_catch + ", version " + id_case + ", " + id_private);
        rrbb_3.id_case("OpenGL Version: " + rrbb_3.id_implements());
        GLCapabilities gLCapabilities = GL.getCapabilities();
        if (!gLCapabilities.OpenGL12) {
            rrbb_3.id_case("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
        }
        if (!(id_volatile = gLCapabilities.GL_NV_fog_distance)) {
            rrbb_3.id_case("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
        }
        if (!(id_final = gLCapabilities.GL_ARB_occlusion_query)) {
            rrbb_3.id_case("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
        }
        int n = rrzJ_2.id_case();
        rrbb_3.id_byte("Maximum texture size: " + n + "x" + n);
    }

    public static int rN() {
        return id_long;
    }

    public static fJ_2 rF() {
        return id_float;
    }

    private static rrMm_1 rY() {
        GLCapabilities gLCapabilities = GL.getCapabilities();
        if (gLCapabilities.OpenGL44) {
            return new rrMm_1(4, 4);
        }
        if (gLCapabilities.OpenGL43) {
            return new rrMm_1(4, 3);
        }
        if (gLCapabilities.OpenGL42) {
            return new rrMm_1(4, 2);
        }
        if (gLCapabilities.OpenGL41) {
            return new rrMm_1(4, 1);
        }
        if (gLCapabilities.OpenGL40) {
            return new rrMm_1(4, 0);
        }
        if (gLCapabilities.OpenGL33) {
            return new rrMm_1(3, 3);
        }
        if (gLCapabilities.OpenGL32) {
            return new rrMm_1(3, 2);
        }
        if (gLCapabilities.OpenGL31) {
            return new rrMm_1(3, 1);
        }
        if (gLCapabilities.OpenGL30) {
            return new rrMm_1(3, 0);
        }
        if (gLCapabilities.OpenGL21) {
            return new rrMm_1(2, 1);
        }
        if (gLCapabilities.OpenGL20) {
            return new rrMm_1(2, 0);
        }
        if (gLCapabilities.OpenGL15) {
            return new rrMm_1(1, 5);
        }
        if (gLCapabilities.OpenGL14) {
            return new rrMm_1(1, 4);
        }
        if (gLCapabilities.OpenGL13) {
            return new rrMm_1(1, 3);
        }
        if (gLCapabilities.OpenGL12) {
            return new rrMm_1(1, 2);
        }
        return gLCapabilities.OpenGL11 ? new rrMm_1(1, 1) : new rrMm_1(1, 0);
    }

    public static int rx() {
        return id_else == null ? 10 : rrbb_3.id_else.id_break;
    }

    public static boolean rT() {
        return rrbb_3.id_else.PE;
    }

    public static boolean rS() {
        if (rrbb_3.id_else.ri == 0) {
            return rrbb_3.id_try();
        }
        return rrbb_3.id_else.ri == 2;
    }

    private static void rK() {
        id_long = yz_3.id_break;
        yz_3.id_break = 0;
    }

    public static boolean Y() {
        return rrbb_3.id_else.id_abstract > 0;
    }
}

