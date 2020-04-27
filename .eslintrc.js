module.exports = {
  extends: "eslint:recommended",
  parserOptions: {
    ecmaVersion: 6,
  },
  env: {
    browser: true,
  },
  rules: {
    "prefer-const": [
      "error",
      {
        destructuring: "any",
        ignoreReadBeforeAssign: true,
      },
    ],
    semi: "error",
  },
};
