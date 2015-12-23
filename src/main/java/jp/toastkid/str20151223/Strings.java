package jp.toastkid.str20151223;

import org.apache.commons.lang3.StringUtils;


/**
 *
 * @author Toast kid
 *
 */
public class Strings {

    /**
     * CamelCase string to snake_case.
     * @param camel string
     */
    public static final String camelToSnake(final String camel) {
        if (StringUtils.isEmpty(camel)) {
            return camel;
        }
        final StringBuilder sb = new StringBuilder(camel.length() + camel.length());
        for (int i = 0; i < camel.length(); i++) {
            final char c = camel.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(sb.length() != 0 ? '_' : "").append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    /**
     * snake_case convert to CamelCase string.
     * @param snake string
     */
    public static final String snakeToCamel(final String snake) {
        if (StringUtils.isEmpty(snake)) {
            return snake;
        }
        final StringBuilder sb = new StringBuilder(snake.length() + snake.length());
        for (int i = 0; i < snake.length(); i++) {
            final char c = snake.charAt(i);
            if (c == '_') {
                sb.append((i + 1) < snake.length() ? Character.toUpperCase(snake.charAt(++i)) : "");
            } else {
                sb.append(sb.length() == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    /**
     * CamelCase string to snake_case.
     * @param camel string
     */
    public static final String camelToSnakeUseArray(final String camel) {
        if (StringUtils.isEmpty(camel)) {
            return camel;
        }
        final StringBuilder sb = new StringBuilder(camel.length() + camel.length());
        final char[] chars = camel.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            final char c = chars[i];
            if (Character.isUpperCase(c)) {
                sb.append(sb.length() != 0 ? '_' : "").append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    /**
     * snake_case convert to CamelCase string.
     * @param snake string
     */
    public static final String snakeToCamelUseArray(final String snake) {
        if (StringUtils.isEmpty(snake)) {
            return snake;
        }
        final StringBuilder sb = new StringBuilder(snake.length() + snake.length());
        final char[] chars = snake.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            final char c = chars[i];
            if (c == '_') {
                sb.append((i + 1) < chars.length ? Character.toUpperCase(chars[++i]) : "");
            } else {
                sb.append(sb.length() == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

}
