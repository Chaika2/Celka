/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.rrWa_1;
import celestial.rrWi_1;
import celestial.rrbb_3;
import celestial.rrzr_3;
import java.lang.management.BufferPoolMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.LongSupplier;

public class rrWe_1 {
    private static long id_class = 0L;
    private static LongSupplier id_break = rrWe_1.id_class(new String[][]{{"sun.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}, {"jdk.internal.misc.SharedSecrets", "getJavaNioAccess", "getDirectBufferPool", "getMemoryUsed"}}, rrWe_1.id_throws());
    private static LongSupplier id_byte = rrWe_1.id_class(new String[][]{{"sun.misc.VM", "maxDirectMemory"}, {"jdk.internal.misc.VM", "maxDirectMemory"}}, rrWe_1.id_case());

    public static long id_byte() {
        return id_class;
    }

    private static LongSupplier id_class(String[][] stringArray, LongSupplier longSupplier) {
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>();
        for (int i = 0; i < stringArray.length; ++i) {
            String[] object = stringArray[i];
            try {
                LongSupplier longSupplier2 = rrWe_1.id_class(object);
                if (longSupplier2 == null) continue;
                return longSupplier2;
            }
            catch (Throwable throwable) {
                arrayList.add(throwable);
            }
        }
        for (Throwable throwable : arrayList) {
            rrbb_3.id_protected("(Reflector) " + throwable.getClass().getName() + ": " + throwable.getMessage());
        }
        return longSupplier;
    }

    private static LongSupplier id_class(String[] stringArray) throws Exception {
        String string;
        if (stringArray.length < 2) {
            return null;
        }
        Class<?> clazz = Class.forName(stringArray[0]);
        Method method = clazz.getMethod(stringArray[1], new Class[0]);
        method.setAccessible(true);
        Object object = null;
        for (int i = 2; i < stringArray.length; ++i) {
            string = stringArray[i];
            object = method.invoke(object, new Object[0]);
            method = object.getClass().getMethod(string, new Class[0]);
            method.setAccessible(true);
        }
        Method method2 = method;
        string = object;
        return new rrzr_3(method2, string);
    }

    public static long id_class() {
        return id_break == null ? -1L : id_break.getAsLong();
    }

    public static synchronized void id_class(fN_2 fN_22) {
        id_class += fN_22.id_implements();
    }

    public static synchronized void id_break(fN_2 fN_22) {
        id_class -= fN_22.id_implements();
    }

    public static long id_break() {
        return id_byte == null ? -1L : id_byte.getAsLong();
    }

    private static LongSupplier id_throws() {
        BufferPoolMXBean bufferPoolMXBean = rrWe_1.id_protected();
        return bufferPoolMXBean == null ? null : new rrWa_1(bufferPoolMXBean);
    }

    private static LongSupplier id_case() {
        return new rrWi_1();
    }

    private static BufferPoolMXBean id_protected() {
        for (BufferPoolMXBean bufferPoolMXBean : ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class)) {
            if (!rrbb_3.id_class((Object)bufferPoolMXBean.getName(), (Object)"direct")) continue;
            return bufferPoolMXBean;
        }
        return null;
    }
}

